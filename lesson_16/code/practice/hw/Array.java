package practice.hw;

public class Array {
    public static void main(String[] args) {
        //Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
        // Найдите среднюю величину по всем элементам массива с четными индексами.
        int[] array = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};//set the array
     //  printArray(array);
       printArray(array);
    }

    //_____Method_____
    public static void printArray(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {//set the parameter
            if (i%2==0){
              //  System.out.print(arr[i] + "|");//print the array
                sum += arr[i];//sum of the even numbers
                count ++;
            }
            System.out.println(sum/count);//the average of all even elements
        }//end of for
    }//end of methods

}
