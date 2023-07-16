public class HomeworkArray {
    public static void main(String[] args) {
        //Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        // Найдите максимальный элемент массива и его индекс.
        int[]num = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};//set the array
        int max = num [0];//as a maximum we take temporarily first element of array
        int point=-1;//counter with -1, because they haven't found one yet
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max){
               max = num[i];//find the maximum element
               point = i;//find the index of max element
            }

        }
        System.out.println("Max = " +max+ " index of max = " + point);
    }
}
