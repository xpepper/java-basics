package it.bemyeye.learn.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExamples {

    public static void main(String[] args) {
        Date now1 = new Date();
        System.out.println(now1);

        Date now2 = new Date(System.currentTimeMillis());
        if (now1.before(now2)) {
            System.out.println(now1 + " e' antecedente a " + now2);
        }

        Calendar tomorrow = Calendar.getInstance();
        tomorrow.add(Calendar.DAY_OF_YEAR, 1);
        System.out.println(tomorrow.getTime());

        Calendar once = new GregorianCalendar(1789, 6, 14);
        System.out.println(once.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.ddHH:mm:ss.SSS");
        System.out.println(sdf.format(now1));
        System.out.println(sdf.format(now2));
        System.out.println(sdf.format(tomorrow.getTime()));
        System.out.println(sdf.format(once.getTime()));

        try {
            Date newDate = sdf.parse("1812.11.24 21:10:52.000");
            System.out.println(newDate);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
}
