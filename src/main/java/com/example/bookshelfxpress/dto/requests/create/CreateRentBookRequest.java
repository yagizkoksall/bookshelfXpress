package com.example.bookshelfxpress.dto.requests.create;

import java.time.LocalDate;
import java.util.UUID;

public class CreateRentBookRequest {
    private UUID bookId;
    private UUID userId;
    private int rentalDurationInDays;


    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public int getRentalDurationInDays() {
        return rentalDurationInDays;
    }

    public void setRentalDurationInDays(int rentalDurationInDays) {
        this.rentalDurationInDays = rentalDurationInDays;
    }
}
