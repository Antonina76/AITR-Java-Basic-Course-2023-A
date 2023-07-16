import java.sql.SQLOutput;
import java.io.*;
import java.util.Scanner;


    public class Main {

    public static void main(String[] args)  {

                double Mo = 23;
                double Di = 24;
                double Mi = 25;
                double Do = 26;
                double Fr = 26;
                double Sa = 24;
                double So = 25;
                double tempAvg = (Mo + Di + Mi + Do + Fr + Sa + So) / 7;
                int tempAvgRound = (int) Math.round(tempAvg);
                System.out.println("Средняя температура за неделю составила :" + tempAvgRound + "градусов");
            }
        }
  /*              double a = 90.0;
                double b = 45.0;
                double c = 86.0;

                System.out.format("%.1f радиан = %.3f градусов %n", a, Math.toDegrees(a));
                System.out.format("%.1f радиан = %.3f градусов %n", b, Math.toDegrees(b));
                System.out.format("%.6f радиан = %.5f градусу %n", c, Math.toDegrees(c));
*/
      /* System.out.println("Вычислите площадь квадрата, если сторона квадрата равна 6");
       int a = 6;
       int b = 6;
       int c = a * b;
       System.out.println(c);
*/
      /*  Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число A ");
        String A = null;
        try {
            A = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int n1 = Integer.parseInt(A);
        System.out.println("Объем куба равен " +(3*n1));
*/
  /*  int x, y;
    x = 135;
    y = 213;
    int z = Math.max (x,y);
        System.out.println("Максимальное из " + x + " и " + y + " = " + z);;
        int z1 = Math.min(x, y);
        System.out.println( "минимальное из " + x + " и " + y + " = " + z1);
        int a = - 321;
        System.out.println(Math.abs (a));//модуль числа а

        int n = 2;
        int k = 10;
        int pow2 = (int) Math.pow(n,k);
        double pow2d = Math.pow (n,k);
        System.out.println(pow2);//целое число
        System.out.println(pow2d);

        System.out.println(Math.PI);
        double s = Math.sqrt(10000.d);//извлечение квадратного корня
        System.out.println(s);
        //радианы это число типа double


        /*System.out.println("Арифмитические действия и класс Math");

        double a = 10.d;// операции с  числами с запятой
        double b = 7.d;
        double c;
        c = a/b;
        System.out.println(c);
        System.out.printf("Результать деления: /f%2", c) ;//форматированный вывод
      /*  int x = 57;
       // x = x+1;
        int y = 10;
        int z;
        /* y--;
        x +=10;//увелячение переменной на 10
        x++;//увеличение значения на единицу
        y -=4;//уменьшение переменной на 4
        x *=10;//увеличение переменной в 10 раз
        System.out.println(x);
        System.out.println(x);
        System.out.println(y);
       System.out.println("x =" + x);
      */
      /* z = x / y;
        System.out.println("частное " + x + " и " + y + " = " + z );
        int zz;
        zz = x % y;
        System.out.println("частное " + x + " и " + y + " = " + zz );
        int x1 = 3;
        // x = x+1;
        int y1 = 10;
        int z1;
        z1 = x1 / y1;
        System.out.println("частное " + x1 + " и " + y1 + " = " + z1 );
        int zz1;
        zz1 = x1 % y1;
        System.out.println("частное " + x1 + " и " + y1 + " = " + zz1 );
        int a = 12;
        System.out.println(a % 2);//деление с остатком
        System.out.println(a % 4);//когда числа разделились без остатка, то остаток от деления 0
      */

