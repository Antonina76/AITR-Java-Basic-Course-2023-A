package HWork;

import practice.Employee;

public class ShapeAppl {
    public static void main(String[] args) {
    Shape [] shapes = new Shape[4];
    shapes [0] = new Circle(6);
    shapes [1] = new Circle(10);
    shapes [2] = new Square(5);
    shapes [3] = new Triangle(5,6,7);
    printArray(shapes);

    double totalPerimeter = totalPerimeter(shapes);
        System.out.println(totalPerimeter);

    double totalArea = totalArea(shapes);
        System.out.println(totalArea);

    }

    public static double totalPerimeter (Shape[]shapes){
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if(shapes [i]!= null){
                sum += shapes [i].calcPerimeter();
            }

        }
        return sum;
    }
    public static double totalArea (Shape[]shapes){
        double sum1 = 0;
        for (int i = 0; i < shapes.length; i++) {
            if(shapes [i]!= null){
                sum1 += shapes [i].calcArea();
            }
        }
        return sum1;
    }


    public static void printArray(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {

                System.out.println(shapes[i]);
            }
        }

    }


}
