import com.github.mfathi91.time.PersianDate;
import com.github.mfathi91.time.PersianMonth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main1(String[] args) throws InterruptedException, ParseException {
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(1000);
        System.out.println(date1);

        System.out.println(System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println(System.currentTimeMillis());
        long current = System.currentTimeMillis();
        Date date2 = new Date(current - 24 * 60 * 60 * 1000);
        System.out.println(date2);

        System.out.println(date.getDay());
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        date.setTime(1000);//mutable
        System.out.println(date);

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String str = sc.nextLine();
        Date date3 = sdf.parse(str);
        System.out.println(date3);
        System.out.println(sdf.format(date));
    }

    public static void main2(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.of(2025, 2, 1);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        dateTime = LocalDateTime.of(2025,2,1,10,20);
        dateTime = date.atTime(time);
        System.out.println(dateTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);

        offsetDateTime = dateTime.atOffset(ZoneOffset.of("+01:00"));
        System.out.println(offsetDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);
        OffsetDateTime offsetDateTime1 = instant.atOffset(ZoneOffset.of("+01:00"));
        System.out.println(offsetDateTime1);
    }

    public static void main3(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.getMonth());
        LocalDateTime dateTime1 = dateTime.minusHours(3);
        System.out.println(dateTime1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String str = dateTime.format(formatter);
        System.out.println(str);

        LocalDateTime dateTime2 = LocalDateTime.parse("2023-02-01 20:06", formatter);
        System.out.println(dateTime2);
    }

    public static void main(String[] args) {
// Instantiate
        PersianDate today = PersianDate.now();
        PersianDate persianDate1 = PersianDate.of(1396, 7, 15);
        PersianDate persianDate2 = PersianDate.of(1396, PersianMonth.MEHR, 15);

// Convert
        PersianDate persianDate5 = PersianDate.of(1397, 5, 11);
        LocalDate gregDate = today.toGregorian();    // => '2018-08-02'
        PersianDate persianDate6 = PersianDate.fromGregorian(gregDate);  //  => '1397/05/11'

// Parse
        PersianDate persianDate3 = PersianDate.parse("1400-06-15");    // From the standard format
        PersianDate persianDate4 = PersianDate.parse("1400/06/15", DateTimeFormatter.ofPattern("yyyy/MM/dd"));    // From a desired format

// Format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        dtf.format(PersianDate.now());    // => e.g. '1396/05/10'
    }
}
