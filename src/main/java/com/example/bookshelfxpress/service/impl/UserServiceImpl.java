package com.example.bookshelfxpress.service.impl;

import com.example.bookshelfxpress.dto.requests.create.CreateUserRequest;
import com.example.bookshelfxpress.dto.requests.update.UpdateUserRequest;
import com.example.bookshelfxpress.dto.responses.create.CreateUserResponse;
import com.example.bookshelfxpress.dto.responses.get.GetUserResponse;
import com.example.bookshelfxpress.dto.responses.update.UpdateUserResponse;
import com.example.bookshelfxpress.model.User;
import com.example.bookshelfxpress.repository.UserRepository;
import com.example.bookshelfxpress.service.UserService;
import com.example.bookshelfxpress.utils.mappers.ModelMapperService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final ModelMapperService mapper;

    public UserServiceImpl(UserRepository repository,ModelMapperService mapper){
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public List<GetUserResponse> getAll() {
        List<User> users = repository.findAll();

        List<GetUserResponse> response = users
                .stream()
                .map(user -> mapper.forResponse().map(user, GetUserResponse.class))
                .toList();

        return response;
    }

    @Override
    public CreateUserResponse add(CreateUserRequest request) {
        User user = mapper.forRequest().map(request,User.class);
        user.setCreatedAt();
        repository.save(user);

        CreateUserResponse response = mapper.forResponse().map(user, CreateUserResponse.class);

        return response;
    }

    @Override
    public UpdateUserResponse update(UUID id, UpdateUserRequest request) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

}
