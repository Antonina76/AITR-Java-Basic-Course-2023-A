import java.util.Scanner;
public class ReversString {
    public static void main(String[] args) {
        // Пользователь вводит строку. Распечатайте эту строку в обратном порядке.
        Scanner scanner = new Scanner(System.in);//switching of  scanner
        System.out.println("Please input your String: ");//request a string
        String string = scanner.nextLine();//taking a string into a variable

       String stringReverse = printStringReverse(string);//switching of method
        System.out.println(stringReverse);
    }
    //_____Method_____
    public static String printStringReverse(String string ) {
        String stringReverse = " ";
        for ( int i = string.length() -1; i >=0; i --) {//unfolding the string
          // System.out.print(n.charAt(i)+ "|");//print of string
            stringReverse=stringReverse + string.charAt(i);

        }//end of for
    return stringReverse;
    }//end of method



 }



