package com.adriel.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.adriel.bookstoremanager.dto.MessageResponseDTO;
import com.adriel.bookstoremanager.entity.Book;
import com.adriel.bookstoremanager.repository.BookRepository;

@Service
public class BookService {
    
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
            .message("Book created with ID " + savedBook.getId())
            .build();
    }
    
}
