package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;


public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter, anotherFormatter;
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime today = LocalDateTime.now();
        ZonedDateTime GMTNow = ZonedDateTime.now(ZoneId.of("GMT"));
        TimeZone timeZone = TimeZone.getTimeZone("US/Eastern");

        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        anotherFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedDate = date.format(formatter);
        String anotherFormattedDate = date.format(anotherFormatter);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        String fmtFormatted = today.format(fmt);

        DateTimeFormatter gmt = DateTimeFormatter.ofPattern("EEEE MM dd, yyyy HH:mm");
        String GMTFormatted = GMTNow.format(gmt);

        System.out.println("Formatted date: " + formattedDate);
        System.out.println("Another Formatted date: " + anotherFormattedDate);
        System.out.println("Date and Time in my timezone: "  + " " + fmtFormatted);
        System.out.println("Date and Time (GMT): " + GMTFormatted);
        System.out.println(time.getHour() + ":" + time.getMinute() + " on " + date.getMonthValue() + "-" + date.getDayOfMonth() + "-" + date.getYear());
    }
}
