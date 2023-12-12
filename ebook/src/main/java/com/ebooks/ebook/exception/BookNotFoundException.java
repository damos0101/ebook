package com.ebooks.ebook.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(int id) {
        super("Не знайдено користувача з id" + id);
    }
}
