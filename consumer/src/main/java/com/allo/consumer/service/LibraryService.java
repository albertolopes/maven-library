package com.allo.consumer.service;

import org.allo.model.Test;
import org.springframework.stereotype.Service;

import static org.allo.service.UserService.findTest;

@Service
public class LibraryService {

    public Test findLibraryTest(){
        return findTest();
    }
}
