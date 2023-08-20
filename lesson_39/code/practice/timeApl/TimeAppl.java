package practice.timeApl;
//нет полей
//нет конструктора
//нет сеттерав и геттеров
//есть метод main

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class TimeAppl {
    public static void main(String[] args) {
    //Работа с датами:
        //
        //узнать текущую дату и время
        //есть дата, какой это был день недели? день месяца? день года?
        //есть дата, как узнать, это было раньше? или позже?
        //Путешествие во времени
        //
        //в будущее currentDay.plus
        //в прошлое currentDay.minus
        //использование ChronoUnit
        //Получение интервала времени
        //
        //Сортировка массива по времени
        //
        //Date Formatter
        //
        //Парсинг даты из строки
        //
        //Разработка приложения Album, в котором есть поле с датой
        //см. UML - схему album.jpg
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);//вернули дату и время в международном формате 2023-08-18T16:52:09.365546
        LocalDate gagarin = LocalDate.of(1961,4,12);

        System.out.println(gagarin.getYear());
        System.out.println(gagarin.getDayOfYear());

        System.out.println("Gagarin day of Month " + gagarin.getDayOfMonth() );
        System.out.println("Gagarin day of Month " + gagarin.getDayOfWeek());

        System.out.println(gagarin.isBefore(currentDate));
        System.out.println(gagarin.isAfter(currentDate));

        System.out.println(" Time Traveling ");

        //add days to current day
        LocalDate newDay = currentDate.plusDays(4000);
        System.out.println(newDay);
        newDay = currentDate.plusWeeks(12);
        System.out.println("Add 12 weeks " + newDay);
        System.out.println("Add 15 weeks " + currentDate.plusWeeks(15));
        System.out.println("Two months ago " + currentDate.minusMonths(2));
        System.out.println(localDateTime.plus(9, ChronoUnit.HALF_DAYS));//сколько половинок дней
        System.out.println(currentDate.plus(10,ChronoUnit.CENTURIES));//прибавили 10 веков, столетий
        LocalDate lenin = LocalDate.of(1870,4,22);
        long res = ChronoUnit.YEARS.between(lenin,gagarin);
        System.out.println(res);//сколько лет прошло между рождением Ленина и запуском Гагарина
        System.out.println(lenin.compareTo(gagarin));//сравнение дат
        System.out.println(lenin.compareTo(currentDate));

        //localdate arrays sorting

        LocalDate[] dates = {gagarin,lenin,currentDate};
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));

        //Date formatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
        System.out.println(gagarin.format(dateTimeFormatter));
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMM/yy");
        System.out.println(gagarin.format(dateTimeFormatter));
        String date1 = "06/07/2023";
        String date2 = "2023-02-02";
        LocalDate localDate1 = dateParse (date1);
        System.out.println(localDate1);
       LocalDate localDate2 = dateParse (date2);
       System.out.println(localDate2);

    }
    private static LocalDate dateParse (String date){
       DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]" );
     //   DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][dd.MM.yyyy]");

        return  LocalDate.parse(date,df);
    }

}
