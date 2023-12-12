package com.ebooks.ebook;

import com.ebooks.ebook.model.Book;
import com.ebooks.ebook.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbookApplication.class, args);
	}

}
