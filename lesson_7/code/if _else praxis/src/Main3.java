import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        System.out.println("if - else praxis - square equation !");
        //Задача 4. Решение квадратного уравнения
        // по коэффициентам квадратного трехчлена а, b и с.

        Scanner scanner = new Scanner(System.in);// switch on scanner
        System.out.println("Input first coefficient  ");
        int a = scanner.nextInt();
        System.out.println("Input second coefficient ");
        int b = scanner.nextInt();
        System.out.println("Input third coefficient ");
        int c = scanner.nextInt();
        int d = b*b - 4*a*c;//calculate discriminant

        if(d<0){
            System.out.println("There are no roots, d is negative " + d);
        } else if (d == 0) {
            double x = -b/(2*a);
            System.out.println("X = " + x);
        } else {
            double x1 = (-b + Math.sqrt(d))/(2 * a);
            double x2 = (-b - Math.sqrt(d))/(2 * a);
            System.out.println("X1 = " + x1 + " , " + " X2 = " + x2) ;
        }
        System.out.println("Thanks and goodbye! ");
    }
}