package com.example;

import com.example.service.ExampleService;
import org.junit.Assert;
import org.junit.Test;

public class ExampleServiceTest {
    
    private ExampleService exampleService = new ExampleService();
    
    @Test
    public void selfNameTest() {
        String name = exampleService.getSelfName();
        Assert.assertEquals("ExuampleService", name);
    }
}
