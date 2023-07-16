package practice.homeWork;
import java.util.Scanner;
public class Ameba {
    public static void main(String[] args) {
        //(цикл) Одноклеточная амёба каждые 3 часа делится на 2 такие же амёбы.
        // Необходимо определить,сколько будет амёб через n часов,
        // если первоначально была только одна амёба.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of hours: ");
        int n = scanner.nextInt();
        int amebaD = 1;
        for (int i = 0; i <n/3; i++) {
            amebaD = amebaD*2;

        }
        System.out.println(" Via " + n + " hours will be " +  amebaD + " amebas .");
    }


}
