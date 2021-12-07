package com.java.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.books.models.Book;
import com.java.books.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
    @RequestMapping("/books/{id}")
    public String show(@PathVariable("id") Long id,Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book) ;
        return "show.jsp";
    }
	
}
