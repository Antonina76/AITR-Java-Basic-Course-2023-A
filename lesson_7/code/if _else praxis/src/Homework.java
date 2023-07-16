import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        System.out.println("Triangle inequality ");
        // Запросить у пользователя три стороны треугольника.
        // Проверить выполнимость неравенства треугольника - любая
        // из сторон должна быть меньше суммы двух других.
        // Сообщить результат пользователю - существует или
        // нет треугольник с введенными сторонами.

        Scanner scanner = new Scanner(System.in);// switch on scanner
        System.out.println("Input first seit of triangle please ");//request the length of the side the triangle
        int a = scanner.nextInt();//input a value
        System.out.println("Input second seit of triangle please ");//request the length of the side the triangle
        int b = scanner.nextInt();//input a value
        System.out.println("Input third seit of triangle please ");//request the length of the side the triangle
        int c = scanner.nextInt();//input a value

        if (a + b < c) {//calculate the inequality
            System.out.println("The triangle with these sides exists. ");//print the results
        } else {
            System.out.println("The triangle with these sides does not exists. ");//print the results
        }
        //Дополнить задачу о сумме углов треугольника контролем,
        // что вводимые углы не больше 90 градусов.

        System.out.println("Input please the degrees of  first angle ");//request degrees of angle
        int x = scanner.nextInt();//input a value
        System.out.println("Input please the degrees of  second angle ");//request degrees of angle
        int y = scanner.nextInt();//input a value
        System.out.println("Input please the degrees of  third angle ");//request degrees of angle
        int z = scanner.nextInt();//input a value
        if(x+y+z == 180){//calculate the sum of the angles
            System.out.println("The triangle exists. ");//print the results

        }

    }

    }
