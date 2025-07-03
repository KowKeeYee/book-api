package com.bookstore.book_api.controller;

import com.bookstore.book_api.model.Book;
import com.bookstore.book_api.respository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;   //Use the Spring annotations for REST

import java.util.List;

@RestController //Tells Spring to treat this as a REST API controller
@RequestMapping("/books")   //Sets the base URL for all endpoints in this controller.
public class BookController {

    @Autowired //Inject the repository automatically
    private BookRepository bookRepository;

    //Get all books
    @GetMapping
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    //Get book by ID
    @GetMapping("/{id}")   //Defines a dynamic part in the URL
    public Book getBookById(@PathVariable Long id){
        return bookRepository.findById(id).orElse(null);
    }
    //@PathVariable Long id: extracts the {id} from the URL

    //Add new book
    @PostMapping
    public Book addBook(@RequestBody Book book){   //@RequestBody accepts JSON data as input
        return bookRepository.save(book);
    }

    //Delete book
    @DeleteMapping
    public void deleteBook(@PathVariable Long id){
        bookRepository.deleteById(id);
    }
}