package practice.try_catch;

import java.util.Scanner;

public class TryCatchAppl {
    public static void main(String[] args) {
        //Деление на 0;
        //Выход за пределы массива;
        //Проверка ввода пользователя на корректность.
     /*   try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input first number: ");
            int a = scanner.nextInt();
            System.out.println("Please input second number: ");
            int b = scanner.nextInt();
            int division = a / b;
            System.out.println("Divison " + a + "/" + b + " = " + division);
        } catch (Exception e){
            System.out.println(e.getMessage()+ e.getCause()+e.toString());

        }
        */
/*
        int [] arr = {5,-7,17,29,30};
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println(arr[7]);
        }catch (Exception e){
            System.out.println(e.getMessage() + e.toString());
        }
        */
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input first number: ");
            int a = scanner.nextInt();
            System.out.println("Your input is: " + a);
        }catch (Exception e){
            System.out.println(e.getCause());

        }
    }
}
