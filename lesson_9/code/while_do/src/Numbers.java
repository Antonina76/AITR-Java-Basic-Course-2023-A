import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        //Задача 3. Пользователь вводит натуральное число (целое, положительное).
        // Выясните, сколько цифр в числе.
      Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer und positive number ");
        int num = scanner.nextInt();
        //Алгоритм:
        //нужно число делить на цело на 10 до тех пор пока частное больше 0
        // (целочисленное деление )
        //245/10 = 24
        // 24/10 = 2
        // 2/10 = 0 целых
        // на каждом шагу увеличитть счетчик на 1
        int count = 0;//начальное значение
        int division = num;
        while (division > 0){//пока частное больше 0
            division = division / 10;//делим на 10, вычисляем частное
            count ++;
            System.out.println(count);
        }//end of while
        System.out.println("Number of digits is: " + count);

    }
}
