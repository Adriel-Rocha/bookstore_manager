package com.adriel.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriel.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
