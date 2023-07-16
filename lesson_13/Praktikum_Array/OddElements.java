public class OddElements {
    public static void main(String[] args) {
        //Написать метод, принимающий массив целых чисел,
        // и возвращающий сумму всех его нечетных элементов (не индексы!, а сами элементы).
        // Массив на 100 элементов задать случайными числами в интервале от 1 до 100.

        int[] number = new int[100];//set the array
        int a = 1, b = 100;//set the parameter of array
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * (b - a + 1) + a);//filling the array with random numbers
        }
        printArray(number);//print the numbers of array
        System.out.println();
        printOddNumbers(number);//call the method


    }

    //_____Methods_____
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {//set the parameter
            // System.out.println(arr[i]);

            System.out.print(arr[i] + "|");//print the array
        }//end of for

    }//end of methods
    //______Methods________
    public static void printOddNumbers(int[] arr) {
        int sum = 0;//set the accumulation variable
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 != 0)// finding the unfair numbers
                sum +=arr[i];//calculate the sum of digits
                System.out.print("Sum of all odd elements is " + sum + ". ");//print of sum
    }
    
    //______Method______
    public static void sumOfOddNum (int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(sum);
            
        }//end of for
        
    }//end of method
    
    
}




