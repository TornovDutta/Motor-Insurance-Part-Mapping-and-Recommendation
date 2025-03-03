package org.example.decode.controller;

import org.example.decode.model.Car;
import org.example.decode.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class CarController {

    @Autowired
    private CarService service;

    @GetMapping("get")
    public List<Car> getAllCars() {
        return service.getAllCars();
    }

    @GetMapping("{id}")
    public Optional<Car> findby(@PathVariable int id) {
        return service.findby(id);
    }

    @PostMapping("add")
    public Car addCar(@RequestBody Car car) {
        return service.addCar(car);
    }

    @PutMapping("{id}")
    public Optional<Car> updateCar(@PathVariable int id, @RequestBody Car car) {
        return service.updateCar(id, car);
    }

    @DeleteMapping("{id}")
    public boolean deleteCar(@PathVariable int id) {
        return service.deleteCar(id);
    }

    @PostMapping("/loadDemo")
    public String loadDemoData() {
        service.loadDemoData();
        return "Demo data loaded successfully!";
    }
}
