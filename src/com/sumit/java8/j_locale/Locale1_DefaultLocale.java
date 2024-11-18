package com.sumit.java8.j_locale;

import java.util.Locale;

public class Locale1_DefaultLocale {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("Locale           = " + locale);

        System.out.println("Language         = " + locale.getLanguage());
        System.out.println("Display Language = " + locale.getDisplayLanguage());
        System.out.println("Country          = " + locale.getCountry());
        System.out.println("Display Country  = " + locale.getDisplayCountry());
    }

}