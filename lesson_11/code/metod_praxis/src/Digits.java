import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
//тело основного метода main
        System.out.println("Methods practice ");
    //определить количество цифр у натурального числа (делим на 10 пока остаток от деления больше 0)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas input integer positive number: ");
        int num = scanner.nextInt();
        int digits = numberOfDigits(num);//вызов метода и передача ему на вход параметра (числа )
        System.out.println("Number of digits is " + digits);
    //сумма цифр
        int sumDigits = sumOfDigits(num);
        System.out.println("Sum of digits is " + sumDigits);

    }
//_________Methods
     public static int numberOfDigits(int n){
    int count = 1;//инициировал счетчик цифр
        while (n/10>0){
        count++;//считаю количество цифр
        n = n/10;
    }//end of while
         return count;
}
    public static int sumOfDigits (int n){
        int sum = 0;
        while (n * 10 / 10 > 0){
            sum = sum + n%10;//% это деление с остатком- это цифра числа , их сумируем
            n = n/10;// уменьшаем число в 10 раз
        }//end of while
        return sum;
    }


//_________End of Methods____________

}
