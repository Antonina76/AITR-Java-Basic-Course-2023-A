
import java.util.Scanner;
import java.util.Locale;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Name");
        //Написать программу, в которую пользователь вводит имя и фамилию
        // в одну строку через пробел. Программа должна выводить имя и
        // фамилию на разных строках. Первая буква имени и фамилии должны
        // быть большими не зависимо от того, как их ввел пользователь,
        // лишние пробелы должны быть удалены. (повторение методов String)

        Scanner scanner = new Scanner(System.in);// turned of the scanner
        System.out.println("Please input your name and surname. ");// request the name
        String name = scanner.nextLine();// read the string
        int nameLength = name.length();//found  the length of the string
        int lastSymbol = nameLength - 1;//found  the last symbol
        int index = name.indexOf(" ");//found the gap index
        String surname = name.substring(index, lastSymbol + 1);//cut out the surname
        name = name.substring(0, index);//cut out the name
        name = name.substring(0, 1).toUpperCase() + name.substring(1);//changed the first letter to a capital letter
        name = name.trim();//removed unnecessary spaces
        System.out.println(name);// printed out the name
        surname = surname.trim();//removed unnecessary spaces
        surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);//changed the first letter to a capital letter
        System.out.println(surname);// printed out the surname


    }

}
// метод делает заглавной 1-ю букву
//    public static String stringCorrected (String string) {
//        char firstLetter = string.toUpperCase().charAt(0); // первая буква строки делается заглавной
//        String stringRest = string.substring(1,string.length()); // выкусывается строка без 1-й буквы
//        return firstLetter + stringRest; // формируем результат
//    }
//    //___________end of Methods________
//}





        /*  System.out.println("Hello, i´will help you choose the right tank. ");//welcome to the user

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

  //  }
//}
