package practice.rectangle.controller;

import practice.rectangle.model.Rectangle;

public class RectangleApplication {
    public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle(10.0,25.0);//создаем объект типа Rectangle
    //вызываем метод perimeter класса Rectangle и выводим на печать

        rectangle1.perimeter(10.0,25.0);
        System.out.println(rectangle1.perimeter(10.0,25.0));

        double s = rectangle1.square(10.0,25.0);
        System.out.println("Square is: " + s);
       //поменяли параметры rectangle
        rectangle1.setA(50);
        rectangle1.setB(100);
        System.out.println(rectangle1.a);//вывели на печать новые параметры
        System.out.println(rectangle1.b);

    }

}
