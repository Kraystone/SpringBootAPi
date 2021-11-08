package com.example.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class SpringBootAPiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAPiApplication.class, args);
        Personnes personnes = new Personnes("Leo", "Catifait");
        System.out.println(personnes.toString());
        ArrayList<Personnes> listPer = new ArrayList<>();
        listPer.add(personnes);
        
    }
}
