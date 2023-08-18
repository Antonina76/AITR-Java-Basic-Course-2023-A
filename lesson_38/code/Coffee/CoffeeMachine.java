package Coffee;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Welcome to our Coffee Shop");
        //предложить меню


        Coffee[]menu = Coffee.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + " - " + (i+1));
        }
        //понять выбор пользователя
        System.out.println("Input the number of your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Your choice is: " + menu[choice - 1].name());
                System.out.println("The volume is: " + menu[choice-1].getVolume() +"ml");
                System.out.println("Price is: " + menu[choice-1].getPrice()+ "euro");
                break;
            }
            //раскопировать choice

            default:{
                System.out.println("Wrong choice.");
            }
        }
        //объявить цену и предложить оплатить


    }
}
