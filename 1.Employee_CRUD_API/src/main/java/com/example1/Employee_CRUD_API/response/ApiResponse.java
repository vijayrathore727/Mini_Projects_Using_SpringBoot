package com.example1.Employee_CRUD_API.response;

import lombok.Data;

import java.time.Instant;
@Data
public class ApiResponse <T> {

    private Instant timestamp;
    private int status;
    private String message;
    private T data;

    public ApiResponse(int status, String message, T data) {
        this.timestamp = Instant.now();
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
