package com.roy.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class BasicController {

    @GetMapping("/index")
    public ResponseEntity index(
            @RequestParam(value = "name",required = false) String name) {
        log.info("into BasicController.index");
        return new ResponseEntity("Hello " + name , HttpStatus.OK);
    }
}
