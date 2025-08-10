package com.wipro.collection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Localdate{
    public static void main(String[] args) {
        Localdate date = Localdate.of(2023, 11, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);
    }
}
