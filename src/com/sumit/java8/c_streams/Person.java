package com.sumit.java8.c_streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private Date dateOfBirth;

}