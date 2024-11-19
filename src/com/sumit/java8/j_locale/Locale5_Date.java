package com.sumit.java8.j_locale;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Locale5_Date {

    public static void main(String[] args) throws ParseException {
        formatDates();
    }

    private static void formatDates() {
        // formatting dateTime
        String dateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.US).format(LocalDateTime.now());
        System.out.println(dateTime);
        //FormatStyle.MEDIUM =   Nov 18, 2024, 7:23:08 PM
        //FormatStyle.SHORT  =   11/18/24, 7:22 PM


        // formatting date
        String date = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.US).format(LocalDateTime.now());
        System.out.println(date);
        //FormatStyle.FULL   =   Monday, 18 November 2024
        //FormatStyle.LONG   =   18 November 2024
        //FormatStyle.MEDIUM =   18 Nov 2024
        //FormatStyle.SHORT  =   18/11/2024


        // formatting time
        String time = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.US).format(LocalDateTime.now());
        System.out.println(time);
        //FormatStyle.MEDIUM =   7:21:16 PM
        //FormatStyle.SHORT  =   7:21 PM
    }

}