package com.sumit.java8.j_locale;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Locale4_Currency {

    public static void main(String[] args) throws ParseException {
        formatCurrencies();
        parseCurrencies();
    }

    private static void formatCurrencies() {
        // formatting currency into default locale format
        String defaultLocaleCurrency = NumberFormat.getCurrencyInstance().format(23.22);
        System.out.println(defaultLocaleCurrency);        //$23.22

        // formatting currency into italy locale format
        String itlyLocaleCurrency = NumberFormat.getCurrencyInstance(Locale.ITALY).format(23.22);
        System.out.println(itlyLocaleCurrency);          //23,22 €
    }

    private static void parseCurrencies() throws ParseException {
        // parsing default locale currency into number
        Number defaultLocale = NumberFormat.getCurrencyInstance().parse("$23.22");
        System.out.println(defaultLocale);        //23.22

        // parsing italy locale currency into number
        Number itlyLocaleStr = NumberFormat.getCurrencyInstance(Locale.ITALY).parse("23,22 €");
        System.out.println(itlyLocaleStr);        //23.22
    }

}