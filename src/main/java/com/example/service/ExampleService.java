package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    
    public String getSelfName() {
        return this.getClass().getSimpleName();
    }
}
