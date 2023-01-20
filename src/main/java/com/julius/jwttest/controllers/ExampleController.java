package com.julius.jwttest.controllers;

import com.julius.jwttest.model.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping({"", "/"})
    public String getExample(){
        System.out.println("example controller");
        return "you're authenticated";
    }

    @GetMapping("/test")
    public String getTest(){
        System.out.println("test controller");
        return "you're authenticated";
    }

    @GetMapping("/car")
    public Car getCar(){
        System.out.println("car controller");
        Car car = new Car();
        car.setId(123);
        car.setName("Bully");
        return car;
    }
}
