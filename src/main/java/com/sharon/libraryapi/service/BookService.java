package com.sharon.libraryapi.service;

import com.sharon.libraryapi.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class BookService {

    private final List<Book> books = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong();

    // Get all books
    public List<Book> getAllBooks() {
        return books;
    }

    // Add a book
    public Book addBook(Book book) {
        book.setId(idCounter.incrementAndGet());
        books.add(book);
        return book;
    }

}
