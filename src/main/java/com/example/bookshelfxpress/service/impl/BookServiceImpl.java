package com.example.bookshelfxpress.service.impl;

import com.example.bookshelfxpress.dto.requests.create.CreateBookRequest;
import com.example.bookshelfxpress.dto.requests.update.UpdateBookRequest;
import com.example.bookshelfxpress.dto.responses.create.CreateBookResponse;
import com.example.bookshelfxpress.dto.responses.get.GetBookResponse;
import com.example.bookshelfxpress.dto.responses.update.UpdateBookResponse;

import java.util.List;
import java.util.UUID;

public interface BookServiceImpl {
    List<GetBookResponse> getAll();
    CreateBookResponse add(CreateBookRequest request);
    UpdateBookResponse update(UUID id,UpdateBookRequest request);
    void delete(UUID id);

}
