package com.adriel.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.adriel.bookstoremanager.dto.BookDTO;
import com.adriel.bookstoremanager.dto.MessageResponseDTO;
import com.adriel.bookstoremanager.entity.Book;
import com.adriel.bookstoremanager.mapper.BookMapper;
import com.adriel.bookstoremanager.repository.BookRepository;

@Service
public class BookService {
    
    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
            .message("Book created with ID " + savedBook.getId())
            .build();
    }
    
}
