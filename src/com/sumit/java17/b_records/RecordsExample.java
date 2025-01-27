package com.sumit.java17.b_records;

public record RecordsExample(String name, int age) {

    // custom canonical constructor
    /*private RecordsExample(String name, int age){
        if(age<18)
            throw new IllegalArgumentException("Minimum age should be 18 !!");
        this.name = name;
        this.age = age;
    }*/

    // compact constructor
    public RecordsExample{
        if(age<18)
            throw new IllegalArgumentException("Minimum age should be 18 !!");
    }

    // override getter
    @Override
    public String name(){
        return name.toUpperCase();
    }

}
