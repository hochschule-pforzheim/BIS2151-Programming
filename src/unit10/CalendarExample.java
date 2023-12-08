package unit10;

import java.util.Calendar;

/**
 * Example Calendar Class
 *
 * @author Andreas Schneider
 */
public class CalendarExample
{

    public static void run()
    {
        Calendar c = Calendar.getInstance();
        // setting time to Dec. 8, 2023 at 22:05
        // Month is zero-based
        c.set(2023, 11, 8, 22, 05);
        long dayOne = c.getTimeInMillis();
        dayOne += 1000 * 60 * 60;
        c.setTimeInMillis(dayOne);
        System.out.println("New hour " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 35);
        System.out.println("Add 35 days " + c.getTime());
        c.roll(c.DATE, 35);
        System.out.println("Roll 35 days " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("Set to 1 " + c.getTime());
    }

}
