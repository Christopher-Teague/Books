package com.java.books.services;

//import static org.mockito.Mockito.description;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.java.books.models.Book;
import com.java.books.repositories.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // Created Methods
    
    public void deleteBook(Long id) { 
    	bookRepository.deleteById(id);
    }
           

	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		if (bookRepository.findById(id) != null) {
			Book book = findBook(id);
			book.setTitle(title);
			book.setDescription(desc);
			book.setLanguage(lang);
			book.setNumberOfPages(numOfPages);
			bookRepository.save(book);
			return book;
			}						
		return null;
	}
    
}