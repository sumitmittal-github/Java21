package com.sumit.java8.j_locale;

import java.util.Locale;

public class Locale2_CreateLocale {

    public static void main(String[] args) {

        // by constructor
        Locale locale1 = new Locale("en", "US");
        System.out.println(locale1);        //en_US

        // by built-in constants
        Locale locale2 = Locale.CANADA;
        System.out.println(locale1);        //en_US

        // by Locale builder pattern
        Locale locale3 = new Locale.Builder()
                            .setLanguage("en")
                            .setRegion("US")
                            .build();
        System.out.println(locale3);        //en_US
    }

}