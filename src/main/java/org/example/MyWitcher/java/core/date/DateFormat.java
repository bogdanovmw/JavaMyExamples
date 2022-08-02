package org.example.MyWitcher.java.core.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(getReadableDateWeekDay(date)); // 24 февраля, четверг
        System.out.println(getReadableDateTime(date)); // 24 February at 1:21
        System.out.println(getReadableDateTimeShort(date)); // 24 фев в 1:21
        System.out.println(getReadableDateWithYear(date)); // 24-02-2022
        System.out.println(getReadableTime(date)); // 2022-02-24 01:21:06 +05

        // SimpleDateFormat является не потоко безопасным
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss X");
        String formatted = format.format(date);

        System.out.println("\nformatted: " + formatted);

        try {
            Date parsedDate = format.parse(formatted);
            System.out.println(date.equals(parsedDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getReadableDateWeekDay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM, EEEE");
        return sdf.format(date);
    }

    public static String getReadableDateTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM', привет БРО, ' H:mm", Locale.US);
        return sdf.format(date);
    }

    public static String getReadableDateTimeShort(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM в H:mm");
        return sdf.format(date);
    }

    public static String getReadableDateWithYear(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    public static String getReadableTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS X");
        return sdf.format(date);
    }
}
