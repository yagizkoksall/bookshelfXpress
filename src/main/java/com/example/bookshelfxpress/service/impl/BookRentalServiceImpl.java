package com.example.bookshelfxpress.service.impl;

import com.example.bookshelfxpress.dto.requests.create.CreateRentBookRequest;
import com.example.bookshelfxpress.dto.responses.create.CreateRentBookResponse;
import com.example.bookshelfxpress.dto.responses.get.GetRentBookResponse;
import com.example.bookshelfxpress.model.BookRental;
import com.example.bookshelfxpress.repository.BookRentalRepository;
import com.example.bookshelfxpress.service.BookRentalService;
import com.example.bookshelfxpress.service.BookService;
import com.example.bookshelfxpress.utils.mappers.ModelMapperService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookRentalServiceImpl implements BookRentalService {
    private final BookRentalRepository repository;
    private final ModelMapperService mapper;

    public BookRentalServiceImpl(BookRentalRepository repository,ModelMapperService mapper, BookService bookService){
        this.repository = repository;
        this.mapper = mapper;
        this.bookService = bookService;
    }

    @Override
    public CreateRentBookResponse rentBook(CreateRentBookRequest request) {
        BookRental bookRental = mapper.forRequest().map(request,BookRental.class);
        bookRental.setRentalStartDate();
        calculateBookRentalEntDate(request, bookRental);

        repository.save(bookRental);


        CreateRentBookResponse response = mapper.forResponse().map(bookRental, CreateRentBookResponse.class);



        return response;
    }

    @Override
    public List<GetRentBookResponse> getAll() {
        List<BookRental> bookRentals = repository.findAll();
        List<GetRentBookResponse> response = bookRentals
                .stream()
                .map(bookRental -> mapper.forResponse().map(bookRental, GetRentBookResponse.class)).toList();

        return response;
    }

    private void calculateBookRentalEntDate(CreateRentBookRequest request, BookRental bookRental) {
        bookRental.setRentalEndDate(bookRental.getRentalStartDate().plusDays(request
                .getRentalDurationInDays()));
    }
}
