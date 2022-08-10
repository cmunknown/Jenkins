package com.example.controller;

import com.example.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
@RequiredArgsConstructor
public class ExampleController {
    
    private final ExampleService exampleService;
    
    @GetMapping
    public String getServiceName() {
        return exampleService.getSelfName() + " hello from IDEAdddsd";
    }
}
