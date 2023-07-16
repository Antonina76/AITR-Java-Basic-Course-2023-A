public class Practice {
    public static void main(String[] args) {
        //Имеются оценки абитуриента из его аттестата,
        // всего 12 оценок. Найдите средний балл абитуриента.
        System.out.println("Average marks of students");
        int [] array = {5,3,3,4,5,3,4,5,4,5,3,2};
        double sum =0;//создаем переменную для суммы
        System.out.println((array.length));
        //для нахождения среднего балла надо ссумировать оценки
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];//sum of marks
        }
        //для нахождения среднего балла надо сумму разделить на 12
        double result = sum/ array.length;//находим средний бал
        System.out.println("Average marks of students is: " + result);//print the result
        System.out.printf("Average marks of students is: %.02f", result);
        System.out.println();
        System.out.printf("Average marks of students is: %.01f", result);
    }
}
