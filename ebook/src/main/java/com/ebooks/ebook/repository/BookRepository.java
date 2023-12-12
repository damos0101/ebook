package com.ebooks.ebook.repository;

import com.ebooks.ebook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
