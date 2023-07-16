public class ArrayPractice {
    public static void main(String[]args){
        System.out.println("Array practice ");
        int[] marks = { -7, 2  ,5 ,4,8,5,3,5,4,1};
        int l = marks.length;
        System.out.println("Length of array " + l);
       // System.out.println(marks);//так распечатается ссылка памяти на массив
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
        System.out.println("___________");
        System.out.println(marks[3]);
        System.out.println(marks[marks.length-1]);//last element of array
       // System.out.println(marks[marks.length]);
    }
}
