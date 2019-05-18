package com.davidhernandeztechpro.spring.springsandbox.controllers;

import com.davidhernandeztechpro.spring.springsandbox.models.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public Book book(
            @RequestParam(value="isbn", defaultValue="World") String isbn
    ) {
        Book book = new Book();
        book.setIsbn(isbn);
        book.setTitle("To mock a book");
        return book;
    }
}
