package practice.homeWork;
import java.util.Scanner;

public class LengthMeasures {
    public static void main(String[] args) {
        //Составьте программу для перевода мер длины:
        //
        //саженей в метры (1 сажень равна 2,1366 м)
        //дюймов в сантиметры (1 дюйм равен 2,5 см)
        //футов в метры (1 фут равен 0,3048 м)
        //аршинов в метры (1 аршин равен 0,7112 м)
        //дюймов в миллиметры (1 дюйм равен 25,3995 мм)
        Scanner scanner1 = new Scanner(System.in);

                System.out.println("Hello, i´will help you with translations of length measures!");//welcome to the user

                System.out.println("To convert: a seedling into meters input 1, inches to centimetres input 2, ft. to meters input 3, arshin to meters input 4, inches into millimetres input 5 ");//request the user
                System.out.println("Please input your choose");

                int choice = scanner1.nextInt();// user input

                switch (choice) {
                    case 1: {
                        seedlMet();
                    }
                    break;

                    case 2: {
                       inchMet();
                    }
                    break;

                    case 3: {
                       ftMet();
                    }
                    break;

                    case 4: {
                        arshMet();
                    }
                    break;

                    case 5: {
                        inchMm();
                    }
                    break;
                    default:
                        System.out.println(" Wrong number!! ");
                }

        }

        // Methods
        public static void seedlMet () {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please input your value: ");
            double n = scanner2.nextDouble();

            if (n > 0) {
                double n1 = n * 2.1366;
                System.out.println("In a " + n + " seedling " + n1 + " meters. ");
            }
        }
        public static void inchMet () {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please input your value: ");
            double n = scanner3.nextDouble();
            if (n > 0) {
                double n1 = n * 2.5;
                System.out.println("In a " + n + " inches " + n1 + " centimetres. ");
            }
        }
        public static void arshMet () {
            Scanner scanner4 = new Scanner(System.in);

            double n = scanner4.nextDouble();

            if (n > 0) {
                double n1 = n * 0.3048;
                System.out.println("In a " + n + " ft. " + n1 + " metres. ");
            }
        }
        public static void ftMet () {
            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Please input your value: ");
            double n = scanner5.nextDouble();

            if (n > 0) {
                double n1 = n * 0.7112;
                System.out.println("In a " + n + " arshin " + n1 + " metres. ");
            }
        }
        public static void inchMm () {
            Scanner scanner6 = new Scanner(System.in);
            System.out.println("Please input your value: ");
            double n = scanner6.nextDouble();

            if (n > 0) {
                double n1 = n * 25.3995;
                System.out.println("In a " + n + " inches " + n1 + " millimetres. ");
            }
        }
    }





