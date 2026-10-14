package com.pixelacademy.springdemo2.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/")
    public String sayHello() {
        return "avem urmatoarele rute: /cars /real-estate /phones";
    }

    @GetMapping("/cars")
    public String showCars() {
        return "bmw, audi, mercedes";
    }

    @GetMapping("/real-estate")
    public String showRealEstate() {
        return "Imobiliare ...";
    }

    @GetMapping("/phones")
    public String showPhones() {
        return "iPhone, Samsung, Xiaomi";
    }

}
