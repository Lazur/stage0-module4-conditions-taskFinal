package school.mjc.stage0.conditions.finalTask;

import java.util.Calendar;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (isValidDate(year, month)) {
            int days = getDaysInMonth(year, month);
            System.out.println(days);
        } else {
            System.out.println("invalid date");
        }
    }

    public static boolean isValidDate(int year, int month) {
        return (year > 0) && (month >= 1 && month <= 12);
    }

    public static int getDaysInMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
