package com.sumit.java8.j_locale;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Locale3_Numbers {

    public static void main(String[] args) throws ParseException {
        formatNumber();
        parseNumber();
    }

    private static void formatNumber() {
        // formatting double into default locale format
        String defaultLocaleStr = NumberFormat.getInstance().format(77000.11);
        System.out.println(defaultLocaleStr);        //77,000.11

        // formatting double into Italy locale format
        String itlyLocaleStr = NumberFormat.getNumberInstance(Locale.ITALY).format(77000.11);
        System.out.println(itlyLocaleStr);          //77.000,11

        // formatting double into France locale format
        String franceLocaleStr = NumberFormat.getNumberInstance(Locale.FRANCE).format(77000.11);
        System.out.println(franceLocaleStr);        //77 000,11
    }

    private static void parseNumber() throws ParseException {
        // parsing default locale string numbers into Number
        double defaultLocale = (double) NumberFormat.getInstance().parse("77,000.11");
        System.out.println(defaultLocale);        //77000.11

        // parsing italy locale string numbers into Number
        double itlyLocaleStr = (double) NumberFormat.getNumberInstance(Locale.ITALY).parse("77.000,11");
        System.out.println(itlyLocaleStr);        //77000.11
    }

}