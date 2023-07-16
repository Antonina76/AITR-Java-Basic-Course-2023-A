import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("if - else praxis - Next-Next!");
        // Задача 3. Написать метод,
        // выводящий на экран максимальное из трех целых чисел.
        // Числа должны вводится с клавиатуры.

        Scanner scanner = new Scanner(System.in);// switch on scanner
        System.out.println("Input first number ");
        int a = scanner.nextInt();
        System.out.println("Input second number ");
        int b = scanner.nextInt();
        System.out.println("Input third number ");
        int c = scanner.nextInt();
        //algoritm
        // шаг 1 . объявить переменную max
        //шаг 2 присвоим max а (любую из переменных)
        // шаг 3 сравним б и мах если б > max dann max = b
        // шаг 4 сравним c и мах если c > max dann max = a

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max){
            max = c;

        }
       int maximum = maxABC(a,b,c);//вызов метода и передали ему на вход 3 числа

        System.out.println("Max from " + a + ", " + b + ", " + c + " is: " + maximum);//print result
    }
    //Methods
    public static int maxABC(int x,int y, int z){
        int max = x;
        if (y > max) {
            max = z;
        }
        if (z > max){
            max = z;

        }
        return max;
    }


    //end of methods
}