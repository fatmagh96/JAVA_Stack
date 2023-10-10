package com.fatma.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fatma.books.models.Book;
import com.fatma.books.services.BookService;


@Controller
public class BookController {
	
    @Autowired
    BookService bookService;

	@RequestMapping("/books/{id}")
	public String showBook(Model model, @PathVariable("id") Long id) {
		System.out.println(id);
		Book book = bookService.findBook(id);
		model.addAttribute("book",book);
		return "display.jsp";
	}
}
