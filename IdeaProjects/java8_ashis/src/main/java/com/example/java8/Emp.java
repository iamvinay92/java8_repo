package com.example.java8;

import lombok.Data;

import java.util.List;

@Data
public class Emp {

    int id;
    String name;
    Long salary;
    List<String> numbers;

    public Emp(int id, String name, Long salary, List<String> numbers ) {
    this.id = id;
    this.name= name;
    this.salary = salary;
    this.numbers = numbers;

    }

}
