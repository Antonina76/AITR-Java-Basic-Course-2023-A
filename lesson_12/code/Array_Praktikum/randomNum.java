import java.util.Arrays;
import java.util.Random;

public class randomNum {
    public static void main(String[] args) {
        //Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
        // Выведите массив на печать.
        // Поменяйте местами первый и последний элементы массива и снова
        // выведите массив на печать.
        //int min = 10;
       // int max = 20;
        //Random random = new Random();
        int [] randomNum = new int[20];
        for (int i = 10; i < randomNum.length; i++) {
        randomNum[i] = (int)(Math.random()*(20-10+1))+10;//generate numbers in the range from 10-20
            System.out.println(i);
        }

        int temp = randomNum[0];
        randomNum[0] = randomNum[randomNum.length-1];
        randomNum[randomNum.length-1]=temp;

        System.out.println(Arrays.toString(randomNum));

        }

    }

