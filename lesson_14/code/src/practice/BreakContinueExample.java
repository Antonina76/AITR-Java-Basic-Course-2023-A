package practice;

public class BreakContinueExample {
    public static void main(String[] args) {
        //напечатать каждый второй элемент массива
    int [] num = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};//filling the array
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0 ){//check the index even or odd
                continue;
            }
            System.out.print(num[i] + " , ");
        }
        System.out.println();


        //найти первый делитель введенного числа
        int n = 553;
        for (int i = 2; i < n-1; i++) {
            if (553 % i == 0){//% это деление с остатком (в данном случае 0, т е без остатка)
                System.out.println("553 делится на " + i);
                break;
            }
        }

    }
}
