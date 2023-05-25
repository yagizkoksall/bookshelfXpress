package com.example.bookshelfxpress.utils.results;


import java.time.LocalDateTime;

public class ExceptionResult<T> {
    private LocalDateTime timestamp;
    private String type;
    private T message;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getType() {
        return type;
    }

    public T getMessage() {
        return message;
    }


    public ExceptionResult(String type, T message) {
        timestamp = LocalDateTime.now();
        this.type = type;
        this.message = message;

    }
}
