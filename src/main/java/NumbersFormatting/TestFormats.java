package NumbersFormatting;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by izunia on 2015-09-22.
 */
public class TestFormats {

    public static void main (String[] args) {
        String s = String.format("%, d", 1000000000);
        System.out.println(s);

        String s1 = String.format("I have %.2f bugs to fix", 47859425.45);
        System.out.println(s1);

        String s2 = String.format("I have %,.3f, bugs to fix", 47859425.4594);
        System.out.println(s2);

        String s3 = String.format("1 na 3 miejscach: %3d.", 1);
        System.out.println(s3);

        System.out.println(String.format("%.2f na 6 znakach z precision = 1: %,6.1f", 42.000, 42.000));

        System.out.println(String.format("%d w HEX: %x",42,42));
        System.out.println(String.format("%d jako CHAR: %c",42,42));

        System.out.println(String.format("Today %tD is the %<td day of the %<tm month of the year %<tY.", new Date()));
        System.out.println(String.format("And you can also say that today (%tc) is %<tA, %<td %<tB %<tY roku.", new Date()));
        System.out.println(String.format("And the hour is %tr.", new Date()));

        Calendar c = Calendar.getInstance();
        c.set(2004,0,7,15,40);
        long day1 = c.getTimeInMillis();
        day1 += 1000 * 60 * 60;
        c.setTimeInMillis(day1);
        System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 35);
        System.out.println("add 35 days " + c.getTime());
        c.roll(c.DATE, 35);
        System.out.println("roll 35 days " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("set to 1 " + c.getTime());

        Calendar calendar = Calendar.getInstance();
        calendar.set(2015,5,2,12,15);
        System.out.println(calendar.getTime());
        calendar.add(calendar.YEAR, 1);
        System.out.println(calendar.getTime());

    }

}
