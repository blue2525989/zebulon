package com.bierbrauer.zebulon.car;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("cars")
public class CarController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("")
    public Car getCars(@RequestParam(value = "car", defaultValue="Subaru WRX") String car) {
        return new Car(counter.incrementAndGet(), car);
    }
}
