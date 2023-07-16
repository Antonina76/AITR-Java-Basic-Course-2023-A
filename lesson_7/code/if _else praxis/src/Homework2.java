import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        System.out.println("Calculate the total purchase price and the discount on goods ");
        Scanner scanner = new Scanner(System.in);// switch on scanner

         System.out.println("Input please cost of goods A");//request for the cost of goods
        double x = scanner.nextDouble();//the user enters the value
        if(x < 0 ){//check positive or negative numbers
            System.out.println("Enter of negative numbers is not permitted ");//print the results
        }
        System.out.println("Input please the discount value ");//request the discount
        double d = scanner.nextDouble();//the user enters the value
        if(d < 0 ){//check positive or negative numbers
            System.out.println("Enter of negative numbers is not permitted ");//print the results
        }
        double discountA = (x*d)/100;//calculate the discount
        double priceA = x- discountA;//calculate the value of the goods with discount
        System.out.println("The cost of goods A with discount is " + priceA + " rub.");//print the results
        System.out.println("Input please number of goods A ");//request quantity of goods
        double n = scanner.nextDouble();//enter the quantity
        if(n < 0 ){//check positive or negative numbers
            System.out.println("Enter of negative numbers is not permitted ");//print the results
        }
        double discA = discountA*n;//calculate the total discount
        double tot = priceA*n;//calculate the total price of goods
        System.out.println("The total price goods A with discount is " + tot);//print the results
        System.out.println("Input please cost of goods B");//request for the cost of goods
        double y = scanner.nextDouble();//the user enters the value
        if(y < 0 ){//check positive or negative numbers
            System.out.println("Enter of negative numbers is not permitted ");//print the results
        }
        System.out.println("Input please the discount value ");//request of discount value
        double c = scanner.nextDouble();//the user enters the value
        if(c < 0 ){//check positive or negative numbers
            System.out.println("Enter of negative numbers is not permitted ");
        }
        double discountB = (y*c)/100;//calculate of discount
        double priceB = y- discountB;//calculate the value of the goods with discount
        System.out.println("The cost of goods B with discount is " + priceB + " rub.");//print the results
        System.out.println("Input please number of goods B ");//request quantity of goods
        double m = scanner.nextDouble();//the user enters the value
        if(m < 0 ){//check positive or negative numbers
            System.out.println("Enter of negative numbers is not permitted ");//print the results
        }
        double discB = discountB*m;//calculate the total discount
        double tot1 = priceB*m;//calculate the total price of goods

        System.out.println("The total price goods B with discount is " + tot1);//print the results
        System.out.println("The total cost your discounted purchase is " + (tot + tot1));//print the results
        System.out.println("The total discount of your goods is " + (discA + discB) + ". ");//print the results



    }

    }

