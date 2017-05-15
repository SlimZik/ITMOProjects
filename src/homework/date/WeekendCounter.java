package homework.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;


public class WeekendCounter {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.DECEMBER, 31);

        System.out.println("Количество выходных дней: " + countWeekend(start, end));

        System.out.println("Количество пятниц 13: " + countDeathFridays(start, end));

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
    static long countDeathFridays(final LocalDate start, final LocalDate end) {
        long result = 0L;
        LocalDate iter = start;
        while (iter.getDayOfMonth() != 13) {     // Переходим к ближайшему 13-ому числу месяца
            iter = iter.plusDays(1);
        }
        while (iter.compareTo(end) < 0) {   // Пока текущая дата меньше конечной
            if (iter.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                result++;
            }
            iter = iter.plusMonths(1);          // Плюсуем месяц
        }
        return result;
    }
}
