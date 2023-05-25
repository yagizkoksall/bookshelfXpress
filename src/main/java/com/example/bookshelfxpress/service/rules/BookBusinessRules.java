package com.example.bookshelfxpress.service.rules;

import com.example.bookshelfxpress.dto.requests.create.CreateBookRequest;
import com.example.bookshelfxpress.repository.BookRepository;
import com.example.bookshelfxpress.utils.constants.Messages;
import com.example.bookshelfxpress.utils.exceptions.BusinessException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookBusinessRules {
    private final BookRepository repository;

    public BookBusinessRules(BookRepository repository) {
        this.repository = repository;

    }

    public void checkIfBookExists(CreateBookRequest request){
        if(repository.existsByBooksNameAndAndTitleAndPublicationYear(request.getBooksName(),
                request.getTitle(), request.getPublicationYear())){
            throw new BusinessException(Messages.Book.Exists);
        }
    }
}
