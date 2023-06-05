package com.example.bookshelfxpress.dto.responses.get;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class GetRentBookResponse {
    private UUID id;
    private int rentalDurationInDays;
    private LocalDateTime rentalStartDate;
    private LocalDateTime rentalEndDate;

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

    public void setRentalStartDate(LocalDateTime rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public LocalDateTime getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(LocalDateTime rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }
}
