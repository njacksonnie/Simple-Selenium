package com.selenium.chrome.experiments;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {


        LocalDateTime myDateObj = LocalDateTime.now();

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate);













//        LocalDate today = LocalDate.now();
//        System.out.println(today);
//
//        LocalTime now = LocalTime.now();
//        now = LocalTime.parse("h:mm a");
//        System.out.println(now);
//
//        String strDateFormat = "HH:mm:ss a";
//        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
//        System.out.println(sdf.format(now));
    }
}
