package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    public void setRepository(BookRepository repository) {

        this.repository = repository;

    }

    public void addBook() {

        System.out.println("Book Service Started");

        repository.saveBook();

        System.out.println("Book Service Completed");

    }

}