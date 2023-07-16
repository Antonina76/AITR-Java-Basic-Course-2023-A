import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        //     С клавиатуры вводятся N чисел. Составьте программу,
        // которая определяет кол-во отрицательных, кол-во положительных и кол-во
        // нулей среди введеных чисел.
        // Значение N вводится с клавиатуры.
        System.out.println("Determine the quantity of positive, negative and zeros numbers. ");
        //что на входе - числа введенные ползователем
        //что на выходе - тоже числа(количество чисел поделенных на группы: отриц., полож. и нули)
        //запустить оператор if else
        //запрашиваем числа у пользователя
        // 1 число = a , 2 число = b , 3 число = c, 4 число =  d , 5 число = e.
        // выясняем положительное число, отрицательное или 0 и высчитываем кол-во одинаковых.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input quantity of numbers N : ");
        int n = scanner.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.println("Please input your numbers: ");
        int num = 0;
        while (num < 0) {
            int number = scanner.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }//end of while
            num++;
        }
        System.out.println("Quantity of positive numbers:" + positive);
        System.out.println("Quantity of negative  numbers:" + negative);
        System.out.println("Quantity of positive numbers:" + zero);
    }
}