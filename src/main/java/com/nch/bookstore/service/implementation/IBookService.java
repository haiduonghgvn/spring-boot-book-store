package com.nch.bookstore.service.implementation;

import com.nch.bookstore.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(long bookId);

    List<Book> findAllBooks();
}
