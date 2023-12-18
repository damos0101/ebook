package com.ebooks.ebook.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(int id) {
        super("Не знайдено книжку з id" + id);
    }
}
