package com.example.bookshelfxpress.controller;

import com.example.bookshelfxpress.dto.requests.create.CreateRentBookRequest;
import com.example.bookshelfxpress.dto.responses.create.CreateRentBookResponse;
import com.example.bookshelfxpress.dto.responses.get.GetRentBookResponse;
import com.example.bookshelfxpress.service.BookRentalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book-rental")
public class BookRentalController {
    private final BookRentalService service;

    public BookRentalController(BookRentalService service){
        this.service = service;
    }

    @PostMapping
    public CreateRentBookResponse rentBook(@RequestBody CreateRentBookRequest request){

       return service.rentBook(request);
    }

    @GetMapping
    public List<GetRentBookResponse> getAll(){
       return service.getAll();
    }

}
