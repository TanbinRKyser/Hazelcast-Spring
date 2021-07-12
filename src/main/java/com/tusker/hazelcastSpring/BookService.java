package com.tusker.hazelcastSpring;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Cacheable("books")
    public String getBookNameByIsbn( int isbn ) {
        return findBookInSlowSource(isbn);
    }

    private String findBookInSlowSource( int isbn ) {
        // some long process
        try {
            Thread.sleep( 10000);
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        }
        return "Domain Driven Development";
    }
}
