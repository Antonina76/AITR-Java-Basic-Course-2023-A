import java.util.Scanner;
public class Homework_2 {
    public static void main(String[] args) {
        //Написать метод, определяющий максимум из трех натуральных чисел. Числа вводит пользователь с клавиатуры.
        // Метод должен быть защищен от ввода отрицательных чисел.
        //что на входе : цифры
        // на выходе тоже цифры
        //числа вводит пользователь
        //запускаем оператор if else, дополнительно пишем метод для вычисления максимальной величины
        //дополняем ввод пользователя защитой от вводда отрицательных чисел


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your first number: ");
        int firstNum = scanner.nextInt();
        if (firstNum <0) {
            System.out.println("Wrong input!! ");
        }
            System.out.println("Please input your second number: ");
        int secondNum = scanner.nextInt();
        if (secondNum <0) {
            System.out.println("Wrong input!! ");
        }
        System.out.println("Please input your third number: ");
        int thirdNum = scanner.nextInt();
        if (thirdNum <0) {
            System.out.println("Wrong input!! ");
        }
        int max = firstNum;
        if (secondNum > max) {
            max = secondNum;
        }
        if (thirdNum > max){
            max = thirdNum;

        }
        int maximum = maxABC(firstNum,secondNum,thirdNum);//вызов метода и передали ему на вход 3 числа

        System.out.println("Max from " + firstNum+ ", " + secondNum + ", " + thirdNum + " is: " + maximum);//print result
    }
    //Methods
    public static int maxABC(int x,int y, int z){
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max){
            max = z;

        }
        return max;
    }


    //end of methods
 }


