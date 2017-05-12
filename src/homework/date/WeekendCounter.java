package homework.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * Created by SLimZik on 12.05.2017.
 */
public class WeekendCounter {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.DECEMBER, 31);

        System.out.println("Количество выходных дней: " + countWeekend(start, end));

    }

    static int countWeekend(LocalDate start, LocalDate end) {
        int weekdays = 0;
        if (start.isEqual(end)) {
            return weekdays;
        }

        while (start.isBefore(end)) {
            if (DayOfWeek.SATURDAY.equals(start.getDayOfWeek()) || DayOfWeek.SUNDAY.equals(start.getDayOfWeek())) {
                weekdays++;
            }
            start = start.plusDays(1);
        }
        return weekdays;
    }
}
