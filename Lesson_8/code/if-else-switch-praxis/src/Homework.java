
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Name");
        //Пользователь вводит с клавитуры число.
        // Вывести абсолютное значение (модуль)
        // числа, используя тернарный оператор.

        Scanner scanner = new Scanner(System.in);// turned of the scanner
        System.out.println("Please input your number. ");
        int a = scanner.nextInt();
        int a1 = (a>0) ? a : -a;
        System.out.println("The modulus of the  number is: " + a1 + ". ");


    /*   System.out.println("Hello, i´will help you choose the right tank. ");//welcome to the user

        System.out.println("Choose the type of rubbish: 1 -packaging, 2 - food, 3 - paper, 4 - rest rubbish. ");//request the user for a type of rubbish

        String choose = scanner.next();// user input

        switch (choose){
            case "1": {
                System.out.println ("You choose is the yellow  tank. ");
                break;
            }
            case "2": {
                System.out.println("You choose is the braun tank. ");
                break;
            }
            case "3": {
                System.out.println("You choose is the green tank. ");
                break;
            }
            case "4": {

                System.out.println("You choose is the black tank. ");
                break;
            }

        }//end of switch
*/

    }
}
