package com.sumit.java17.d_textblocks;

public class TextBlockExample {

    public static void traditionalJson(){
        String json = "{\n" +
                "\"First Name\" : \"Sumit\" \n  " +
                "\"Last Name\" : \"Mittal\" \n  " +
                "}";
        System.out.println(json);
    }

    public static void textBlockJson(){
        String json = """
                {
                    "First Name" : "Sumit"
                    "Last Name" : "Mittal"
                }
                """;
        System.out.println(json);
    }

    public static void main(String[] args) {
        traditionalJson();
        textBlockJson();
    }

}