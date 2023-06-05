package com.example.bookshelfxpress.controller;

import com.example.bookshelfxpress.dto.requests.create.CreateUserRequest;
import com.example.bookshelfxpress.dto.responses.create.CreateUserResponse;
import com.example.bookshelfxpress.dto.responses.get.GetUserResponse;
import com.example.bookshelfxpress.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserServiceImpl service;

    public UserController(UserServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<GetUserResponse> getAll() {
        return service.getAll();
    }

    @PostMapping
    public CreateUserResponse add(@RequestBody CreateUserRequest request){
        return service.add(request);
    }
}
