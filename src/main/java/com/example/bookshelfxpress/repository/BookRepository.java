package com.example.bookshelfxpress.repository;

import com.example.bookshelfxpress.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
    boolean existsByBooksNameAndAndTitleAndPublicationYear(String booksName, String title, int publicationYear);
}
