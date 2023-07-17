package hw;
import java.util.Scanner;
public class Hw1 {

    Double a;
    Double b;
    Double c;

    public double root(double a, double b, double c) {
        Double d = b * b - 4 * a * c; // calculate discriminant
        if (d < 0) {
            System.out.println("There are no roots, d is negative " + d);
        }
        return d;
    }

    public double root1(double a, double b, double c) {
        Double d = b * b - 4 * a * c; // calculate discriminant
        if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("X = " + x);
        }
        return d;

    }

}