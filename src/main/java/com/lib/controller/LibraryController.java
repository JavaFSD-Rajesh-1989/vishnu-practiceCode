package com.lib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lib.Exception.BookAlredyExistException;
import com.lib.entity.Book;
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

}