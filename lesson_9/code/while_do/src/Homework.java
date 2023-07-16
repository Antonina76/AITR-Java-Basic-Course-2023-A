import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
     // Программа получает на вход строку и число повторений этой строки
        // Программа должна вывести эту строку нужное количество раз.
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the string. ");
        String line = scanner.nextLine();
        System.out.println("Please input the number of repetitions. ");
        int  repetitions = scanner.nextInt();
        while (repetitions>0){
            System.out.println(line);
            repetitions--;
        }//end of while

    }
}
