package com.allo.consumer.controller;

import com.allo.consumer.service.LibraryService;
import org.allo.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class LibraryController {

    @Autowired
    private LibraryService service;

    @GetMapping
    public ResponseEntity<Test> findTest(){
        return ResponseEntity.ok(service.findLibraryTest());
    }

}
