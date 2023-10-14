package com.codingdojo.bookClub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.bookClub.models.Book;
import com.codingdojo.bookClub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
    //find all books
	public List<Book> findAllBooks() {
		return bookRepo.findAll();
	}
	
	// find book by id
	public Book findBookById(Long id) {
		Optional<Book> optBook = bookRepo.findById(id);
		if(optBook.isPresent()) {
			return optBook.get();
		}
		return null;
	}
	
	
	// Create book
	public Book createBook(Book b) {
		return bookRepo.save(b);
	}
	
	// edit Book
	public Book editBook(Book b) {
		return bookRepo.save(b);
	}
	
	//delete book
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	

}
