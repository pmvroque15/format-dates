package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter, anotherFormatter;
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime today = LocalDateTime.now();
        ZonedDateTime GMTNow = ZonedDateTime.now(ZoneId.of("GMT"));

        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        anotherFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedDate = date.format(formatter);
        String anotherFormattedDate = date.format(anotherFormatter);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd, yyyy");
        String fmtFormatted = today.format(fmt);

        DateTimeFormatter gmt = DateTimeFormatter.ofPattern("MM dd, yyyy HH:mm");
        String GMTFormatted = GMTNow.format(gmt);

        System.out.println("Formatted date: " + formattedDate);
        System.out.println("Another Formatted date: " + anotherFormattedDate);
        System.out.println("Date and Time in my timezone: " + date.getDayOfWeek() + " " + fmtFormatted);
        System.out.println("Date and Time (GMT): " + today.getDayOfWeek() + ", " + GMTFormatted);
    }
}
