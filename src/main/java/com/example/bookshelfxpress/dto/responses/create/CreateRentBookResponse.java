package com.example.bookshelfxpress.dto.responses.create;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CreateRentBookResponse {
    private String booksName;
    private LocalDateTime rentalEndDate;


    public String getBooksName() {
        return booksName;
    }

    public void setBooksName(String booksName) {
        this.booksName = booksName;
    }

    public LocalDateTime getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(LocalDateTime rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }
}
