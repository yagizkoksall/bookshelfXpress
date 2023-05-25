package com.example.bookshelfxpress.controller;

import com.example.bookshelfxpress.dto.requests.create.CreateBookRequest;
import com.example.bookshelfxpress.dto.responses.create.CreateBookResponse;
import com.example.bookshelfxpress.dto.responses.get.GetBookResponse;
import com.example.bookshelfxpress.model.Book;
import com.example.bookshelfxpress.service.impl.BookServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {
    private final BookServiceImpl service;

    public BooksController(BookServiceImpl service){
        this.service = service;
    }

    @GetMapping
    public List<GetBookResponse> getAll(){
        return null;
    }

    @PostMapping
    public CreateBookResponse add(@RequestBody CreateBookRequest request){
        return service.add(request);
    }




}
