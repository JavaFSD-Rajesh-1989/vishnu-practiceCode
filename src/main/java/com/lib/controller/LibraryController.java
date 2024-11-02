package com.lib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lib.Exception.BookAlredyExistException;
import com.lib.entity.Book;
import com.lib.entity.BorrowingRecord;
import com.lib.service.LibraryService;

import java.util.List;

@RestController
@RequestMapping("lib")
public class LibraryController {
    @Autowired
    private LibraryService service;
    
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) throws BookAlredyExistException{
    	Book savedBook=service.addBook(book);
    	return ResponseEntity.ok(savedBook);
    }
    @PostMapping("/books/{bookId}/borrow/{userId}")
    public ResponseEntity<BorrowingRecord> borrowBook(@PathVariable Long bookId, @PathVariable Long userId) {
        return ResponseEntity.ok(service.borrowBook(bookId, userId));
    }

}