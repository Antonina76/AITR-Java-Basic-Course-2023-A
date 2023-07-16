public class Homework_1 {
    public static void main(String[] args) {
     //   Вводится положительное целое число, найдите сумму его цифр.
        int num = 12;
        int sum = 0;
        while (num > 0){
        sum = sum + (num % 10);//
        num /= 10;
        }//end of while
        System.out.println(sum);
    }
}
