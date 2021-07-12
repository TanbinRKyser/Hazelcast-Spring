package com.tusker.hazelcastSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController( BookService bookService ) {
        this.bookService = bookService;
    }

    @GetMapping("/{isbn}")
    public String getBookNameByIsbn( @PathVariable("isbn") int isbn ){
        return bookService.getBookNameByIsbn( isbn );
    }
}
