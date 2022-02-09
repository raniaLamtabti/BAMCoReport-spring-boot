package com.example.demo;

import com.example.demo.repository.generic.GenericRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication<T> {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    /*@Bean
    public GenericRepository<T> genericRepository() {
        return new GenericRepository<T>();
    }*/
}
