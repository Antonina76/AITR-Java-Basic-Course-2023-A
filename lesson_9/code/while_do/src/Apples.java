import java.util.Scanner;
public class Apples {
    public static void main(String[] args) {
        //Задача 1. Задача о яблоках (начальное значение 30 яблок).
        // Запустить цикл, в котором яблоки беруться из
        // корзины до тех пор, пока они там есть. Последнее сообщение: "Яблоки кончились!".

        Scanner scanner = new Scanner(System.in);
        int apples = 30;
        int howManyApples;

        System.out.println("We have 30 apples in basket. ");
    while (apples > 0){
        System.out.println("How many apples take from basket: ");
        howManyApples = scanner.nextInt();
        System.out.println("Take apple from basket ");
        apples = apples - howManyApples;//apples = apples -1;
        System.out.println("In basket left " + apples + " apples. ");
    }//end of while

        System.out.println("Apples are finished. Basket is empty! ");
    }
}
//Шаг 1. Задаем переменную (счетчик, параметр) цикла;
// Шаг2. Определить условие повторения цикла;
// Шаг 3. Заполнить тело цикла необходимыми оператрами;
// Шаг 4. Изменить переменную (счетчик, параметр) цикла;
// Шаг 5. Запустить цикл и проверить его работу на крайних значениях и в целом.