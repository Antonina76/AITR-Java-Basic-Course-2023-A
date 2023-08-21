package HW39;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation {
    //Задача 1. В классе DateOperation (см. package for_hw) реализовать метод getAge,
    // принимающий дату рождения в виде String, и возвращающий возраст в годах.
    //
    //Задача 2. В классе DateOperation (см. package for_hw), реализовать метод
    // sortStringDates, принимающий массив дат в виде массива данных типа String,
    // и возвращающий отсортированный массив дат.

    // Для проверки используйте класс DateOperationTest с Unit-тестами.
    public static int getAge(String birthDate) {
        LocalDate date = stringConvertToLocalDate(birthDate);
        return (int) ChronoUnit.YEARS.between(date, LocalDate.now());
    }

    public static String[] sortStringDates(String[] dates) {
        String[] res = Arrays.copyOf(dates, dates.length);
        Arrays.sort(res, (d1, d2) -> stringConvertToLocalDate(d1).compareTo(stringConvertToLocalDate(d2)));
        return res;
    }

    private static LocalDate stringConvertToLocalDate(String stringDate) {
        return LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));
    }


}

