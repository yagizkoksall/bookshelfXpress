package com.example.bookshelfxpress.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "bookRentals")
public class BookRental {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int rentalDurationInDays;
    private LocalDateTime rentalStartDate;
    private LocalDateTime rentalEndDate;


    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getRentalDurationInDays() {
        return rentalDurationInDays;
    }

    public void setRentalDurationInDays(int rentalDurationInDays) {
        this.rentalDurationInDays = rentalDurationInDays;
    }

    public LocalDateTime getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate() {
        this.rentalStartDate = LocalDateTime.now();
    }

    public LocalDateTime getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(LocalDateTime rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
