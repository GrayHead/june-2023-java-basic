package com.okten.homeworks.lesson5.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Main {

    public static void main(String[] args) {


        List<Car> cars = new ArrayList<>();

        cars
                .stream()
                .limit(Math.round(cars.size() / 2))
                .peek(car -> car.setPower(car.getPower() + 10))
                .peek(car -> {
                    Driver driver = car.getDriver();
                    if (driver.getAge() > 25 && driver.getExp() < 1) {
                        driver.setExp(driver.getExp() + 1);
                    }
                })
                .mapToDouble(car -> car.getPrice())
                .sum();


    }
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Car {
    private String producer;
    private int power;
    private int price;
    private int year;
    private Driver driver;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Driver {
    private String name;
    private int age;
    private int exp;
}
