package org.allo.service;

import org.allo.model.Test;

public class UserService {

    public static Test findTest(){
        return Test.builder()
                .id(1L)
                .teste1("teste1")
                .teste2("teste2")
                .teste3("teste3")
                .teste4("teste4")
                .build();
    }
}
