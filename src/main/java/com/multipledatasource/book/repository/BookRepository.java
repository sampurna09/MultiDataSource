package com.multipledatasource.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multipledatasource.model.book.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
