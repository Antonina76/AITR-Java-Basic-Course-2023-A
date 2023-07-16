import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {

        System.out.println("if - else praxis - Next !");
        //Задание 2: Объявите две переменные целого
        // типа a и b и присвойте им значения с клавиатуры.
        // Создайте третью переменную sum и выведите ее значение
        // на экран таким образом:
        // Если a = b, то sum будет равно 2*(a+b) a если нет,
        // то sum= a+b.
        Scanner scanner = new Scanner(System.in);// switch on scanner
        System.out.println("Input first number ");
        int a = scanner.nextInt();
        System.out.println("Input second number ");
        int b = scanner.nextInt();
        int sum;

        if ( a == b ){
        sum = 2 * ( a+b );
        } else {
            sum = a + b;
        }

        System.out.println("sum = " + sum + ". " );
    }
}