package com.example.aop.controller;

import com.example.aop.config.Timer;
import com.example.aop.service.AopTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class AopTestController {

    private final AopTestService service;

    @GetMapping("/task1/{to}")
    @Timer
    public Long task1(@PathVariable Integer to){
        return service.task1(to);
    }


}
