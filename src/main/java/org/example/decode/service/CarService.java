package org.example.decode.service;

import org.example.decode.Repository.CarRepo;
import org.example.decode.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepo carRepo;


    public void loadDemoData() {
        if (carRepo.count() == 0) {
            Car car1 = new Car();
            car1.setId(1);
            car1.setNumber("1234");
            car1.setName("Tesla Model S");
            car1.setPartNo(2023);
            car1.setClaimNo("CLM-001");
            car1.setTotal(5);

            Car car2 = new Car();
            car2.setId(2);
            car2.setNumber("67890");
            car2.setName("BMW X5");
            car2.setPartNo(2022);
            car2.setClaimNo("CLM-002");
            car2.setTotal(3);

            Car car3 = new Car();
            car3.setId(3);
            car3.setNumber("11223");
            car3.setName("Audi A6");
            car3.setPartNo(2021);
            car3.setClaimNo("CLM-003");
            car3.setTotal(7);

            carRepo.save(car1);
            carRepo.save(car2);
            carRepo.save(car3);
        }
    }

    public List<Car> getAllCars() {
        return carRepo.findAll();
    }

    public Optional<Car> findby(int id) {
        return carRepo.findById(id);
    }

    public Car addCar(Car car) {
        return carRepo.save(car);
    }

    public Optional<Car> updateCar(int id, Car updatedCar) {
        return carRepo.findById(id).map(car -> {
            car.setNumber(updatedCar.getNumber());
            car.setName(updatedCar.getName());
            car.setPartNo(updatedCar.getPartNo());
            car.setClaimNo(updatedCar.getClaimNo());
            car.setTotal(updatedCar.getTotal());
            return carRepo.save(car);
        });
    }

    public boolean deleteCar(int id) {
        if (carRepo.existsById(id)) {
            carRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
