import java.util.Scanner;
public class Homework_1 {
    public static void main(String[] args) {
        //  В сберкассу на трёхпроцентный вклад положили S рублей.
        //  Какой станет сумма вклада через N лет?

        //что на входе: цифры (сумма вклада и количество лет)
        //запускаем цикл while
        // ввод пользователя суммы вклада deposit  = 500 евро допустим и количество лет
        // - допустим 3 года period = 3;
        //что на выходе  : тоже цифры
        //начало отсчета day = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your deposit amount: ");
        double deposit = scanner.nextDouble();
        System.out.println("Please input the desired deposit period: ");
        double period = scanner.nextDouble();
        int year = 0;
        double deposit1 = deposit + (deposit * 0.03) * period;
        double sum = deposit * 0.03;
        while (year < period) {
         //   sum=sum+sum*0.03;
            year++;
            sum = (year == 1) ? (deposit + (deposit * 0.03)) : (sum + (sum * 0.03));
        }//end of while
        System.out.println("The amount of your deposit after " + period + " years " + "will be " + sum) ;
        System.out.println(deposit1);
    }
}
