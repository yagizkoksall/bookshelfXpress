package com.example.bookshelfxpress.service;

import com.example.bookshelfxpress.dto.requests.create.CreateRentBookRequest;
import com.example.bookshelfxpress.dto.responses.create.CreateRentBookResponse;
import com.example.bookshelfxpress.dto.responses.get.GetRentBookResponse;

import java.util.List;

public interface BookRentalService {
    CreateRentBookResponse rentBook(CreateRentBookRequest request);

    List<GetRentBookResponse> getAll();
}
