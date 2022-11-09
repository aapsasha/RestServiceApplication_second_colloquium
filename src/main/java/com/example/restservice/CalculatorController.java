package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/calculation")
    public Calculation greeting(@RequestParam(value = "operation", defaultValue = "sum") String operation, @RequestParam(value = "firstNumber", defaultValue = "0") String firstNumber, @RequestParam(value = "secondNumber", defaultValue = "1") String secondNumber) {
        double firstDouble = Double.parseDouble(firstNumber);
        double secondDouble = Double.parseDouble(secondNumber);
        switch(operation){
            case "sum": return new Calculation(counter.incrementAndGet(), Double.toString(Calculator.sum(firstDouble,secondDouble)));
            case "div": return new Calculation(counter.incrementAndGet(), Double.toString(Calculator.division(firstDouble,secondDouble)));
            case "dif": return new Calculation(counter.incrementAndGet(), Double.toString(Calculator.difference(firstDouble,secondDouble)));
            case "mul": return new Calculation(counter.incrementAndGet(), Double.toString(Calculator.multiplication(firstDouble,secondDouble)));
            default: throw new OperationNotFoundException(operation);
        }
    }
}