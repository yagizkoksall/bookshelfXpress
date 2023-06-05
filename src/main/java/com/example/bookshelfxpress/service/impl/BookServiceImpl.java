package com.example.bookshelfxpress.service.impl;

import com.example.bookshelfxpress.dto.requests.create.CreateBookRequest;
import com.example.bookshelfxpress.dto.requests.update.UpdateBookRequest;
import com.example.bookshelfxpress.dto.responses.create.CreateBookResponse;
import com.example.bookshelfxpress.dto.responses.get.GetBookResponse;
import com.example.bookshelfxpress.dto.responses.update.UpdateBookResponse;
import com.example.bookshelfxpress.model.Book;
import com.example.bookshelfxpress.repository.BookRepository;
import com.example.bookshelfxpress.service.BookService;
import com.example.bookshelfxpress.service.rules.BookBusinessRules;
import com.example.bookshelfxpress.utils.mappers.ModelMapperService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository repository;
    private final BookBusinessRules rules;
    private final ModelMapperService mapper;


    public BookServiceImpl(BookRepository repository, BookBusinessRules rules, ModelMapperService mapper) {
        this.repository = repository;
        this.rules = rules;
        this.mapper = mapper;
    }

    @Override
    public List<GetBookResponse> getAll() {
        List<Book> books = repository.findAll();
        List<GetBookResponse> response = books
                .stream()
                .map(book -> mapper.forResponse().map(book, GetBookResponse.class))
                .toList();

        return response;
    }

    @Override
    public CreateBookResponse add(CreateBookRequest request) {
        rules.checkIfBookExists(request);
        Book book = mapper.forRequest().map(request, Book.class);
        book.setCreatedAt();
        repository.save(book);
        CreateBookResponse response = mapper.forResponse().map(book, CreateBookResponse.class);

        return response;
    }

    @Override
    public UpdateBookResponse update(UUID id,UpdateBookRequest request) {
        Book book = mapper.forRequest().map(request,Book.class);
        book.setId(id);
        repository.save(book);

        UpdateBookResponse response = mapper.forResponse().map(book, UpdateBookResponse.class);

        return response;
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);

    }






}
