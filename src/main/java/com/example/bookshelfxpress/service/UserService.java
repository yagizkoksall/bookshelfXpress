package com.example.bookshelfxpress.service;

import com.example.bookshelfxpress.dto.requests.create.CreateUserRequest;
import com.example.bookshelfxpress.dto.requests.update.UpdateUserRequest;
import com.example.bookshelfxpress.dto.responses.create.CreateUserResponse;
import com.example.bookshelfxpress.dto.responses.get.GetUserResponse;
import com.example.bookshelfxpress.dto.responses.update.UpdateUserResponse;
import com.example.bookshelfxpress.model.User;
import com.example.bookshelfxpress.repository.UserRepository;
import com.example.bookshelfxpress.service.impl.UserServiceImpl;
import com.example.bookshelfxpress.utils.mappers.ModelMapperService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public interface UserService {


    List<GetUserResponse> getAll();
    CreateUserResponse add(CreateUserRequest request);
    UpdateUserResponse update(UUID id,UpdateUserRequest request);
    void delete(UUID id);
}
