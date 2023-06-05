package com.example.bookshelfxpress.repository;

import com.example.bookshelfxpress.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
