public class findElement {
    public static void main(String[]args){
    // Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
        // Найдите минимальный элемент массива и его индекс.
        int []numbers = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};
        int min = numbers[0];//в качестве минимума временно назначали 1 ый элемент массива(под индексом 0)
        int pointer = -1;//это значит, что такого еще не нашли
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];//находим минимальный элемент
                pointer = i; //сохраняем его номер в переменной pointer
            }
        }
            System.out.println("Min = " + min + " index of min = " + pointer );
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]+ " ");
            }
        }
    }

