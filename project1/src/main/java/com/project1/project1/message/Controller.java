package com.project1.project1.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/vishwa")
    public String Message()
    {
        return "Hello good afternoon";
    }
}
