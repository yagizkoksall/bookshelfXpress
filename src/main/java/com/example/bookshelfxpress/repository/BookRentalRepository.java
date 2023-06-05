package com.example.bookshelfxpress.repository;

import com.example.bookshelfxpress.model.BookRental;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRentalRepository extends JpaRepository<BookRental, UUID> {

}
