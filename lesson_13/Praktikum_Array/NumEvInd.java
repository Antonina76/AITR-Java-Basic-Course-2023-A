public class NumEvInd {
    public static void main(String[] args) {
      //  Написать метод, принимающий массив целых чисел, и возвращающий
        //  произведение всех его элементов, с четными индексами.
        //  0 - тоже четное число.
        int[] num = {0,6,3,2,5,7,9,1};//filling the array
        System.out.println("Sum array even index = " + printArray(num));//print sum of the even numbers

    }
    //_______Method______
    public static int printArray(int[] arr) {
        int sum = 0;//set a variable to accumulate the sum
        for (int i = 0; i < arr.length; i++) {//set the parameter
            if ( i %2 == 0) {//find an even index in the array
                sum = sum + arr[i];//find the sum of number with even index
              //  System.out.println(i);//print all even index
            }

        }//end of for
        return sum;
        }//end of methods

    }




