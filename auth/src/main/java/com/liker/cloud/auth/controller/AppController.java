package com.liker.cloud.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
public class AppController {

    @GetMapping(value = "/ping")
    public String ping() {
        return "pong";
    }
}