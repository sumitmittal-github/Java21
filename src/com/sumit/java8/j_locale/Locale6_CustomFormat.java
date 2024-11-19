package com.sumit.java8.j_locale;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Locale6_CustomFormat {

    public static void main(String[] args) throws ParseException {

        String str1 = new DecimalFormat("##,##,##,##.###").format(77000.11);
        System.out.println(str1);

        String str2 = new DecimalFormat("00,00,00,00.000").format(77000.11);
        System.out.println(str2);

    }

}