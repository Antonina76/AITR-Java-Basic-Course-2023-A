// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.io.*;
import java.sql.SQLOutput;



public class Main {

    public static void main(String[] args) {

           System.out.println("Conversion of radians to degrees ");
            Scanner scanner = new Scanner(System.in);// запустили Сканнер*/

        //Сделайте расчет покупки товаров со скидками.
        // Стоимость, количество товаров и скидку на них вводит пользователь.
        // Товар А стоит X руб и на него скидка D%, а товар B стоит Y руб и на него скидка С%.
        // Клиент взял N товаров A и M товаров B.
        // Выведите итоговую стоимость покупки и полученной скидки.

       /* System.out.println("Input please cost of goods A");//запрашиваем стоимость товара
        double x = scanner.nextDouble();
        System.out.println("Input please the discount value ");//запрашиваем скидку
        double d = scanner.nextDouble();
        double discountA = (x*d)/100;//высчитываем скидку
        double priceA = x- discountA;//высчитываем стоимость товара со скидкой
        System.out.println("The cost of goods A with discount is " + priceA + " rub.");
        System.out.println("Input please number of goods A ");//запрашиваем количество товаров
        double n = scanner.nextDouble();
        double discA = discountA*n;//высчитываем общую скидку на товар
        double tot = priceA*n;//высчитываем общую стоимость товара со скидкой
        System.out.println("The total price goods A with discount is " + tot);

        System.out.println("Input please cost of goods B");
        double y = scanner.nextDouble();
        System.out.println("Input please the discount value ");
        double c = scanner.nextDouble();
        double discountB = (y*c)/100;
        double priceB = y- discountB;
        System.out.println("The cost of goods B with discount is " + priceB + " rub.");
        System.out.println("Input please number of goods B ");
        double m = scanner.nextDouble();
        double discB = discountB*m;
        double tot1 = priceB*m;
        System.out.println("The total price goods B with discount is " + tot1);

        System.out.println("The total cost your discounted purchase is " + (tot + tot1));
        System.out.println("The total discount of your goods is " + (discA + discB) + ". ");
*/
        //Напишите приложение, которое переводит радианы в градусы.
        // Радианы - это число типа double.

     /*   System.out.println("Please input value in radians ");//запрашиваем радианы у пользователя
        double radian =scanner.nextDouble();
        double rad1 = 57.2956;// мера угла в один вариант высчитана по формуле

        double degrees = rad1 * radian;// высчитываем значение для заданного количества радиан

        System.out.println("In "  +  radian  + " radian " + " is " + degrees + " degrees. ");*/

        //Пусть цена товара A обычно составляет 1000 евро, и товара B составляет 500 евро.
        // Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
        // Выведите на экран стоимость суммы A + B со скидкой.
        // Отдельно выведите на экран абсолютную величину скидки для этой покупки.System.out.println("Calculating the discounted purchase price ");
        /*int a = 1000;
        int b = 500;
        int purchasePrice = a + b;//высчитываем общую стоимость товара
        int discount = (purchasePrice*10)/100;//высчитываем скидку на общую стоимость
        int discountedPrice = purchasePrice - discount;//высчитываем стоимость товаров за вычетом скидки
        System.out.println("The cost of a discounted purchase is " + discountedPrice + " euro. ");
        System.out.println("Absolute value of the discount is " + discount + " euro."); */

        // Вычислите площадь треугольника по формуле Герона:
        // p = (a + b + с)/2; S = sqrt(p*(p-a)(p-b)(p-c));

     /*   System.out.println("Input please the value of first side of the triangle ");//запрашиваем длину первой стороны треугольника
        double a = scanner.nextDouble();
        System.out.println("Input please the value of double side of the triangle ");//запрашиваем длину второй стороны треугольника
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Input please the value of third side of the triangle ");//запрашиваем длину третьей  стороны треугольника
        double a = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = (a + b + c)/2;//вычисляем полупериметр
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));//вычисляем площадь треугольника пр формуле Герона
        System.out.println("The area of the triangle according to Geron`s formula is " + s.);

        //Написать программу для перевода градусов по Фаренгейту в шкалу Цельсия.
        // Формула для перевода С = 5*(F-32)/9.Запросить у пользователя температуру.

     /*   System.out.println("Input please the temperature in degrees Fahrenheit");//запрашиваем температуру у пользователя
        double fahrenheit = scanner.nextDouble();
        double celsius = (5* (fahrenheit-32)/9);// находим значение по формуле
        System.out.println("Tht temperature in degrees Celsius is " + celsius + " degrees. ");

        //Вычислите гипотенузу по двум катетам. Длину катетов запросите у пользователя. Теорема Пифагора:
        // В прямоугольном треугольнике квадрат длины гипотенузы равен сумме квадратов длин катетов.
     /*   System.out.println("Input the length of the first cathetus ");//запрос длины первого катета
        double length1 = scanner.nextInt();
        System.out.println("Input the length of the second cathetus ");//запрос длины второго катета
        double length2 = scanner.nextInt();
        double Sumsquer  = (length1*length1 + length2*length2);// вычисление суммы катетов
        double squerHypot = Math.sqrt(Sumsquer);//вычисление длины гипотенузы
        System.out.println("Length of hypotenuse is " + squerHypot);

        //        Написать программу для вычисления средней стомости поездки по транспортному проездному.
//        Попросить пользователя ввести стоимость проездного на месяц
//        и количество рабочих дней в месяце. Считая, что в рабочий день в среднем две поездки,
//        и 1.5 поездки в выходной, посчитать и округлить общее число поездок в месяц
//        и посчитать среднюю стоимость одной поездки по проездному для месяца май.

       /* System.out.println("Input cost of City ticket ");
        double priceMonthCard = scanner.nextDouble(); //считываем от пользователя стоимость билета
        System.out.println("Input Days current in Month");
        int workingDays = scanner.nextInt();
        int trip = workingDays*2;//количество поездок в рабочие дни
        int holyldays = 31-workingDays;
        int holydaysTrip = (int)Math.round(1.5 * holyldays);//double holydaysTrip = math......// колич. поезд в выходные
        //trip = trip + holydaysTrip;не хорошо
        int trips = 0;
        trips = trip + holydaysTrip;
        System.out.println(" Number of Trips in May " + trips);
        double AverageTripsPrice = priceMonthCard/trips;// вычесляем среднюю стоимость
       System.out.println("Average price " + AverageTripsPrice);//выводим на печать

        System.out.printf("Average price =%.2f", 49AverageTripsPrice);


        /*    System.out.println("Calculate length and area of circle ");
            System.out.println("Input radius of circle ");
            double radius = scanner.nextDouble();
            double l = 2 * Math.PI * radius;
            double s = Math.PI * radius * radius;
            double s1 = Math.PI * Math.pow(radius, 2);
            System.out.println("Length of circle is " + l);
            System.out.println("Area of circle is " + s);
*/
        }
    }
            /*System.out.println("input 1st angle: ");//запрос первого угла
            int A1 = scanner.nextInt();
            System.out.println("input 2t  angle: ");//запрос первого угла
            int A2= scanner.nextInt();

            int A3 = 180 - A1 - A2;
            System.out.println("3 rd angle in  triangle is " + A3);
*/



