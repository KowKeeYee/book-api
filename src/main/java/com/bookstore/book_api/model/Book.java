package com.bookstore.book_api.model;

import jakarta.persistence.*;

@Entity //mention that this class map to DB
public class Book {
    
    @Id   //This marks the field id as the primary key of the table
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //This tells the database to auto-generate the primary key (id) using IDENTITY strategy
    //GenerationType.IDENTITY = AUTO_INCREMENT
    private Long id;

    private String title;
    private String author;

    //constructors
    public Book(){};

    //Getters & Setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }
}
