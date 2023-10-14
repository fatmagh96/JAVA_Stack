package com.codingdojo.bookClub.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.bookClub.models.Book;
import com.codingdojo.bookClub.models.User;
import com.codingdojo.bookClub.services.BookService;
import com.codingdojo.bookClub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {

	@Autowired
	private BookService bookServ;

	@Autowired
	private UserService userServ;

	@GetMapping("/books")
	public String books(HttpSession session, Model model) {
		Long id = (Long) session.getAttribute("user_id");
		User user = userServ.findUserById(id);
		model.addAttribute("loggedUser", user);

		List<Book> books = bookServ.findAllBooks();
		model.addAttribute("books", books);
		return "dashboard.jsp";
	}

	@GetMapping("/books/new")
	public String bookForm(@ModelAttribute("newBook") Book newBook) {
		return "bookForm.jsp";
	}

	@PostMapping("/books/new")
	public String createBook(@Valid @ModelAttribute("newBook") Book newBook, BindingResult result,
			HttpSession session) {
		if(result.hasErrors()) {
			return "bookForm.jsp";
		}
		Long user_id = (Long) session.getAttribute("user_id");
		User user = userServ.findUserById(user_id);
		newBook.setUser(user);
		bookServ.createBook(newBook);
		return "redirect:/books";
	}
	
	@GetMapping("/books/{id}")
	public String bookPage(@PathVariable("id") Long id,Model model, HttpSession session) {
		Book book = bookServ.findBookById(id);
		model.addAttribute("book", book);
		return "bookPage.jsp";
	}
	
	@GetMapping("/books/edit/{id}")
	public String editBook(Model model,
			@PathVariable("id") Long id) {
		
		Book book = bookServ.findBookById(id);
		model.addAttribute("book", book);
		return "editBook.jsp";
	}
	
	@PutMapping("/books/edit/{id}")
	public String updateBook(@Valid @ModelAttribute("book") Book book,
			BindingResult result, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "editBook.jsp";
		}
		Book oldBook = bookServ.findBookById(id);
		book.setUser(oldBook.getUser());
		bookServ.editBook(book);
		return "redirect:/books";
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		bookServ.deleteBook(id);
		return "redirect:/books";
	}

}
