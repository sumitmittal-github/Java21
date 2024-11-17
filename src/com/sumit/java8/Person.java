package com.sumit.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private Date dateOfBirth;

}