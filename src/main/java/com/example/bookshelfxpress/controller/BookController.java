package com.example.bookshelfxpress.controller;

import com.example.bookshelfxpress.dto.requests.create.CreateBookRequest;
import com.example.bookshelfxpress.dto.responses.create.CreateBookResponse;
import com.example.bookshelfxpress.dto.responses.get.GetBookResponse;
import com.example.bookshelfxpress.service.impl.BookServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookServiceImpl service;

    public BookController(BookServiceImpl service){
        this.service = service;
    }

    @GetMapping
    public List<GetBookResponse> getAll(){
        return service.getAll();
    }

    @PostMapping
    public CreateBookResponse add(@RequestBody CreateBookRequest request){
        return service.add(request);
    }




}
