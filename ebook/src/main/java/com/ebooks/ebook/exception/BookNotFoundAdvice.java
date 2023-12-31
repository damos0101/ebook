package com.ebooks.ebook.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class BookNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(BookNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> exceptionHandler(BookNotFoundException exception){
        Map<String, String> errorMap=new HashMap<>();
        errorMap.put("Помилка", exception.getMessage());
        return errorMap;
    }
}
