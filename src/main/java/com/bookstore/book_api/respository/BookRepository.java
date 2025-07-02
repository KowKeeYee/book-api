package com.bookstore.book_api.respository;

import com.bookstore.book_api.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    
}

//JpaRepository gives built-in methods like save(), findAll(), findById(), and deleteById().