package com.example.bookshelfxpress.service;

import com.example.bookshelfxpress.dto.requests.create.CreateBookRequest;
import com.example.bookshelfxpress.dto.requests.update.UpdateBookRequest;
import com.example.bookshelfxpress.dto.responses.create.CreateBookResponse;
import com.example.bookshelfxpress.dto.responses.get.GetBookResponse;
import com.example.bookshelfxpress.dto.responses.update.UpdateBookResponse;
import com.example.bookshelfxpress.model.Book;
import com.example.bookshelfxpress.repository.BookRepository;
import com.example.bookshelfxpress.service.impl.BookServiceImpl;
import com.example.bookshelfxpress.service.rules.BookBusinessRules;
import com.example.bookshelfxpress.utils.mappers.ModelMapperService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


public interface BookService {
    List<GetBookResponse> getAll();
    CreateBookResponse add(CreateBookRequest request);
    UpdateBookResponse update(UUID id,UpdateBookRequest request);
    void delete(UUID id);
}
