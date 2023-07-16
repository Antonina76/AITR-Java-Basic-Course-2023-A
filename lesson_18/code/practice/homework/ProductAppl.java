package practice.homework;

public class ProductAppl {
    public static void main(String[] args) {
        //creating objects from class MilkFood and MeatFood

        MilkFood milk1 = new MilkFood(1.99, "Lucky Cow", 1234567L, "pasteurized and skimmed", 0.01);
        MilkFood milk2 = new MilkFood(1.00, "Milk 3,2 %", 23456789L, "pasteurized", 3.2);
        MilkFood milk3 = new MilkFood(1.89, "Milk 3,8 %", 23456788L, "pasteurized", 3.8);
        MilkFood milk4 = new MilkFood(2.00, "Milk 1,5 %", 23456787L, "pasteurized", 1.5);
        MilkFood milk5 = new MilkFood(1.98, "Milk 3,5 %", 234567896L, "pasteurized", 3.5);

        MeatFood meat1 = new MeatFood(5.99, "beef", 3456789L, "beef meat");
        MeatFood meat2 = new MeatFood(6.89, "lamb", 45678910L, "lamb meat");
        MeatFood meat3 = new MeatFood(3.99, "chicken", 45678911L, "chicken meat");
        MeatFood meat4 = new MeatFood(4.80, "pork", 45678912L, "pork meat");

        Food[] food1 = new Food[5];//set the array
        food1[0] = milk1;
        food1[1] = milk2;
        food1[2] = milk3;
        food1[3] = meat1;
        food1[4] = meat2;
        printArray(food1);//called the method

        Food [] storeProducts = new Food[9];//set the array all products in the store
        storeProducts [0] = milk1;
        storeProducts [1] = milk2;
        storeProducts [2] = milk3;
        storeProducts [3] = milk4;
        storeProducts [4] = milk5;
        storeProducts [5] = meat1;
        storeProducts [6] = meat2;
        storeProducts [7] = meat3;
        storeProducts [8] = meat4;

        printSum(storeProducts);

        System.out.printf("The sum of all products in the store is %.2f:",printSum(storeProducts));//print result and reduced it to two decimal digits
        System.out.println();

        Food prod1 = new Food(3.00,"Wurst ",1234567L,true);
        Food prod2 = new Food(2.80,"Butter ",1234567L,false);
        MilkFood prod3 = new MilkFood(1.00,"Milk ",1234567L,true,"pasteurized",1.5);
        MeatFood prod4 = new MeatFood(5.80,"Lamb ",1234565L,false, "lamb meat");

        Food [] prod= new Food[4];
        prod [0] = prod1;
        prod [1] = prod2;
        prod [2] = prod3;
        prod [3] = prod4;
        printArray(prod);
        printSum(prod);
        System.out.printf("The sum of all products in the store is %.2f:",printSum(prod));
        System.out.println();

        System.out.println(prod1.equals(prod2));



    }

    //_____methods_____
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }//method for print array

    }
    public static double printSum (Product[]arr){
        double sum = 0;//set a variable sum to accumulate the sum
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getPrice();//calculate the sum of all products
        }
       return sum;
    }


    }





