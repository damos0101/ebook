package com.ebooks.ebook.controller;

import com.ebooks.ebook.exception.BookNotFoundException;
import com.ebooks.ebook.model.Book;
import com.ebooks.ebook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/book")
    Book newBook(@RequestBody Book newBook){
        return bookRepository.save(newBook);
    }

    @GetMapping("/books")
    List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/book/{id}")
    Book getBookById(@PathVariable int id){
        return bookRepository.findById(id).orElseThrow(()->new BookNotFoundException(id));
    }

    @PutMapping("/book/{id}")
    Book updateBook(@RequestBody Book newBook, @PathVariable int id){
        return bookRepository.findById(id)
                .map(book -> {
            book.setTitle(newBook.getTitle());
            book.setYear(newBook.getYear());
            book.setAuthor(newBook.getAuthor());
            book.setDescription(newBook.getDescription());
            return bookRepository.save(book);
        }).orElseThrow(()->new BookNotFoundException(id));
    }

    @DeleteMapping("/book/{id}")
    String deleteBook(@PathVariable int id){
        if(!bookRepository.existsById(id)){
            throw new BookNotFoundException(id);
        }
        bookRepository.deleteById(id);
        return "Користувач з id " + id + " був видалений успішно";
    }

}
