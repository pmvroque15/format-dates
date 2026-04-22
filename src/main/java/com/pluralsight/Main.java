package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;


public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter, anotherFormatter;
        LocalDateTime today = LocalDateTime.now();

        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = today.format(formatter);


        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE dd, yyyy");

        DateTimeFormatter gmt = DateTimeFormatter.ofPattern("EEEE MMM dd, yyyy");
        DateTimeFormatter gmtTimeFormat = DateTimeFormatter.ofPattern("HH:ss");
        String GMTFormatted = today.format(gmt);
        LocalDateTime GMTZone = today.plusHours(5);
        String GMTTimeFormat = GMTZone.format(gmtTimeFormat);


        System.out.println("Formatted date: " + formattedDate);
        System.out.println("Another Formatted date: " + today.format(fmt));
        System.out.println("Date and Time (GMT): "  + " " + GMTFormatted + " " + GMTTimeFormat);
        System.out.println("Date and Time(EST): " + today.getHour() + ":" + today.getMinute() + " on " + today.getMonthValue() + "-" + today.getDayOfMonth() + "-" + today.getYear());

    }
}
