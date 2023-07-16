import java.util.Scanner;
public class Natural_Random_Numbers {
    public static void main(String[] args) {
//Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
// Запросите у пользователя какое-то натуральное число. Определите, есть ли это
// число в массиве. Создайте и используйте метод searchInArray, который получает
// на вход массив и искомое число, а возвращает ответ - нашлось ли это число в массиве.
   Scanner scanner = new Scanner(System.in);

    int [] num = new int[10];
       int a = 1, b = 100;
        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int)(Math.random()*(b-a + 1)+a);
        }
        printArray(num);//вызываем метод и печатаем массив
        System.out.println();

        System.out.println("Please input number for search (integer and positive. ");
        int n = scanner.nextInt();
        while (n<0){
            System.out.println("Wrong input! Try again ");
            n = scanner.nextInt();//переспрашиваем ввод числа
        }

        //вызов метода поиска и печать результата

         if (searchInArray(num,n)){
            System.out.println("We find the number!" + "Index of number is " + searchIndexArray(num,n));

            }else {
                System.out.println("We didn´t find the number" + searchIndexArray(num,n));
            }
        }


    //_____Methods________
    public static int searchIndexArray (int[]num,int n){
        int index = -1;// несуществующий индекс
        for (int i = 0; i < num.length; i++) {
            //проверяем что в массиве есть такое число
            if(n==num[i]){
               index = i;
               return index;
            }//end of if
        }//end of for
        return index;
    }//end of method




    public static boolean searchInArray (int[]num,int n){

        for (int i = 0; i < num.length; i++) {
           //проверяем что в массиве есть такое число
            if(n==num[i]){
               return true;
            }//end of if
        }//end of for
    return false;
    }//end of method

    public static void printArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
           // System.out.println(arr[i]);
            System.out.print(arr[i] + "|");
        }

    }//end of method

    //_____end of Methods______
}
