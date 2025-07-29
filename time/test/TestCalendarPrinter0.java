package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);

        LocalDate lastDate = date.with(TemporalAdjusters.lastDayOfMonth());
        int lastDay = lastDate.getDayOfMonth();

        int offsetWeekDays = date.getDayOfWeek().getValue() % 7;
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }
        for (int i = 0; i < lastDay; i++) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.printf("%2d ", i+1);
            if (dayOfWeek == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            date = date.plusDays(1);
        }
    }
}