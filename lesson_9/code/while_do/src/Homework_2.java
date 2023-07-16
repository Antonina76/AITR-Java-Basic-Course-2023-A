import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {
    //В первый день спортсмен пробежал s километров,
        // а затем он каждый день увеличивал пробег на 10 % от
        // предыдущего значения. Определите номер дня, на
        // который пробег спортсмена составит не менее target
        // километров. Программа получает на вход действительные
        // числа s и target и должна вывести одно натуральное число.
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your target ");
        double target = scanner.nextDouble();
        System.out.println("How many kilometers did you run on the first day? ");
        double firstDayS = scanner.nextDouble();
        int day = 1;
         while ( firstDayS<target ) {
            firstDayS = firstDayS + firstDayS * 0.1;//*=1.1
            day = day + 1;// day++

         }//end of while

        System.out.println(day);
    }

}
