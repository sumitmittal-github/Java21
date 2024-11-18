package com.sumit.java8.j_locale;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Locale3_Numbers {

    public static void main(String[] args) throws ParseException {
        numberToStringLocaleConversion();
        stringToNumberLocaleConversion();
    }

    private static void numberToStringLocaleConversion() {
        // converting num to string in default locale
        String defaultLocaleStr = NumberFormat.getInstance().format(77000.11);
        System.out.println(defaultLocaleStr);        //77,000.11

        // converting num to string in Italy locale
        String itlyLocaleStr = NumberFormat.getNumberInstance(Locale.ITALY).format(77000.11);
        System.out.println(itlyLocaleStr);          //77.000,11

        // converting num to string in France locale
        String franceLocaleStr = NumberFormat.getNumberInstance(Locale.FRANCE).format(77000.11);
        System.out.println(franceLocaleStr);        //77 000,11
    }

    private static void stringToNumberLocaleConversion() throws ParseException {
        // converting String num of default locale into double
        double defaultLocale = (double) NumberFormat.getInstance().parse("77,000.11");
        System.out.println(defaultLocale);        //77000.11

        // converting String num of Italy locale into double
        double itlyLocaleStr = (double) NumberFormat.getNumberInstance(Locale.ITALY).parse("77.000,11");
        System.out.println(itlyLocaleStr);        //77000.11
    }

}