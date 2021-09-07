package com.nch.bookstore.repository;

import com.nch.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IBookRepository extends JpaRepository<Book,Long>
{
}
