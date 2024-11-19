package com.sumit.java8.j_locale;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Locale7_ChangeLocale {

    public static void main(String[] args) throws ParseException {

        /*
        // 1 - changing default locale country
        Locale.setDefault(Locale.FRANCE);

        Locale defaultLocale = Locale.getDefault();
        System.out.println("Locale           = " + defaultLocale);                      //fr_FR
        System.out.println("Language         = " + defaultLocale.getLanguage());        //fr
        System.out.println("Display Language = " + defaultLocale.getDisplayLanguage()); //français
        System.out.println("Country          = " + defaultLocale.getCountry());         //FR
        System.out.println("Display Country  = " + defaultLocale.getDisplayCountry());  //France



        // 2 - only changing the Category.DISPLAY
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.Category.DISPLAY, Locale.FRANCE);
        System.out.println("Locale           = " + defaultLocale);                      //en_US
        System.out.println("Language         = " + defaultLocale.getLanguage());        //en
        System.out.println("Display Language = " + defaultLocale.getDisplayLanguage()); //anglais
        System.out.println("Country          = " + defaultLocale.getCountry());         //US
        System.out.println("Display Country  = " + defaultLocale.getDisplayCountry());  //États-Unis
        */


        // 3 - only changing the Category.DISPLAY
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.Category.FORMAT, Locale.FRANCE);
        System.out.println(NumberFormat.getInstance().format(77000.11));  //77 000,11

    }

}