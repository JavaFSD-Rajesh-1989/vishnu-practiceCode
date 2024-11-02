package com.lib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.Exception.BookAlredyExistException;
import com.lib.entity.Author;
import com.lib.entity.Book;
import com.lib.entity.BorrowingRecord;
import com.lib.entity.User;
import com.lib.repo.AutherRepo;
import com.lib.repo.BookRepo;
import com.lib.repo.BorrowingRecordRepo;
import com.lib.repo.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private AutherRepo autherRepo;

    @Autowired
    private BorrowingRecordRepo borrowRepo;

	public Book addBook(Book book) throws BookAlredyExistException {
		if(bookRepo.existsByTitle(book.getTitle())) {
			throw new BookAlredyExistException("Book alredy exists in our base try another one");
		}
		 // Fetch the full author entity based on the author ID in the book
        Long authorId = book.getAuthor().getId();
        Author author = autherRepo.findById(authorId)
            .orElseThrow(() -> new IllegalArgumentException("Author not found with id: " + authorId));
        
        // Set the fully fetched author entity to the book
        book.setAuthor(author);
		return bookRepo.save(book);
	}

	 public BorrowingRecord borrowBook(Long bookId, Long userId) {
	        Optional<Book> bookOptional = bookRepo.findById(bookId);
	        Optional<User> userOptional = userRepo.findById(userId);
	        if (bookOptional.isPresent() && userOptional.isPresent()) {
	            Book book = bookOptional.get();
	            if (book.getStatus().equals("AVALIABLE") ) {
	                book.setStatus(Book.Status.BORROWED);
	                bookRepo.save(book);
	                BorrowingRecord record = new BorrowingRecord();
	                record.setBook(book);
	                record.setUser(userOptional.get());
	                return borrowRepo.save(record);
	            } else {
	                throw new RuntimeException("Book not available for borrowing");
	            }
	        } else {
	            throw new RuntimeException("Book or User not found");
	        }
	    }

	
  
}
