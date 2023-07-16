public class Homework_1 {
    public static void main(String[] args) {
        long n = 10000;//начальное данное к задаче
      //  double i = 1;
       // double sum = 0;
        System.out.println("Sum is: " + sumOfFraction(n));
        }//end of while

    //Method
    public static double sumOfFraction(double n) {
        double sum = 0;
        double i = 1;
        while (i <= n) {//пока параметр цикла i меньше n
            sum = sum + 1 / i;//накапливаем сумму
            i++;//увеличиваем параметр
        }
        return sum;


        //end of method
    }
}

