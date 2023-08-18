package practice.month;

public class MonthAppl {
    public static void main(String[] args) {
        Month month = Month.DEC;
        System.out.println(month);
        System.out.println(month.plusMonth(3));
        System.out.println(month.plusMonth(13));
        System.out.println(Month.getName(12));
        System.out.println("======количество дней по имени месяца======");
        System.out.println(month.DEC.getDays());
        Month month1 = Month.AUG;//взяли месяц в переменную
        System.out.println(month1.getDays());
        System.out.println(Month.AUG.getDays());

    }
}
