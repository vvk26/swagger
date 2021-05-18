package com.src.swagger.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @CrossOrigin
    @GetMapping(value = "/swaggerGet")
    public ResponseEntity<?> swaggerTest() {
        return ResponseEntity.ok().body("Swagger for Get call working fine");
    }

    @CrossOrigin
    @PostMapping(value = "/swaggerPost")
    public ResponseEntity<?> swaggerPost(@RequestParam(value = "test",required = false) String test) {
        return ResponseEntity.ok().body("Swagger for Post call working fine : "+ test);
    }
}

