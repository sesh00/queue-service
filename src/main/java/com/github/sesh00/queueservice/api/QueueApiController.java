package com.github.sesh00.queueservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class QueueApiController {

    @GetMapping
    public String greet() {
        return "Hello";
    }

}