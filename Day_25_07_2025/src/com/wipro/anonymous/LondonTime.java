package com.wipro.anonymous;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;
public class LondonTime{
    public static void main(String[] args) {
        Consumer<String> printTime = zone -> {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of(zone));
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println("Current time in " + zone + ": " + time);
        };
        printTime.accept("Europe/London");
    }
}