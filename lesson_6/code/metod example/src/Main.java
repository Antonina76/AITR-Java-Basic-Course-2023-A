
public class Main {
    public static void main(String[] args) {

        System.out.println("Perimeter of Rectangle with method ");
        int a = 100;//first lange rectangle
        int b = 300; // double lange rectangle
        int per = perimeter(a,b);//вызов метода
        System.out.println("Perimeter = " + per);
    }//end of method main
    //........Method .........
    public static int perimeter (int x, int y){// метод получает на вход два числа
        //int p = (x +y)*2;
       // return p;
        return (x+y)*2;//возвращает результат
    }
    //...........end of Method..........
} // end of Class Main