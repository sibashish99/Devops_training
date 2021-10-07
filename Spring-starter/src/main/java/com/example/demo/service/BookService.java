package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service
public class BookService {
	@Autowired
   private Book book;
	
	public Book getBookbyId(int id) {
		book.setBookName("java");
		book.setBookId(101);
		book.setAuthor("ramesh");
		if(id==1) {
			book.setBookName("python");
			book.setBookId(102);
			book.setAuthor("suresh");
		}
		return this.book;
	}
}
