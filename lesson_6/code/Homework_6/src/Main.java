import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //   Даны строки разной длины (длина - четное число), необходимо
        //   вернуть два средних знака этой строки. Например,
        //   если дана строка "string" результат будет "ri",
        //   для строки "code" результат "od",
        //для "Practice" результат "ct".

      /*  String st = "like";// input the line
        String stNew = st.substring(1, 3);// cut out the middle
        System.out.println(stNew);// print the result
    }
}*/
        /*Scanner scanner = new Scanner(System.in);// turned on Scanner

         */
        Reader inputStreamReader = new InputStreamReader(System.in);//preparing keyboard input
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//preparing keyboard input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//the entered values fall into br
        System.out.println("Please enter your string ");// query the string from the user
        String Name = br.readLine();//reading a string from the keyboard
        System.out.println("Your string is I like Java ");//let's read the string
        String st = Name;
      int l =st.length();//find the length of string
        System.out.println(" Length of the string is " + l);//print the result
        String stNew = st.substring(0,11);//find left and right index
        System.out.println(stNew);// print the result

        st.charAt(0) //first symbol
        st.charAt(st.length() - 1);
        // subst (x,y) -Буква с индексом х а буква с индекс  y не попадает
        //выкушанная строка без первого и последнего символа
        // с т р о к а  это строка
        // 0 1 2 3 4 5  это индексы символов в строке





    }
}
        //Запросить у пользователя длину радиуса окружности.
        // Написать метод, который находит площадь круга для введенного радиуса.
        // Вычислить площадь круга, вызвав написанный метод.
      /*  System.out.println("Please input the length of the circle radius ");// request the length of radius
        double r = scanner.nextDouble();//read the radius value
        double sq = square(r);//running the method
        System.out.println("The square of the circle is " + sq + ".");

    }
        public static double square (double r) {//method gets one number
        double s = 3.14*(r*r);//calculating the area of the circle
        return s;//return the result

}
} */

      /*  System.out.println("String praxis ");
        String st = "I'm proud to learn Java! Java is the most famous programming language!!!";
        // Распечатать последний символ строки.
        int leng = st.length();//the length of the string
        System.out.println("The length of string is " + leng);//Output the string length
        System.out.println(st);
        char lastSymbol = st.charAt(71);// recognized  the last symbol
        System.out.println("Last Symbol is " + lastSymbol);// Output the last symbol
        //Найти позицию подстроки “Java” в строке.
        int index = st.indexOf("Java");//find the Java word index
        System.out.println("Java starts from index " + index);//print the Java word index

        //Проверить, содержит ли заданная строка подстроку “Java”.

        boolean trueFalse = st.contains("Java");//request
        System.out.println(trueFalse);// print the result

        //Заменить все символы “o” на “a”.

        String st1 = st.replace("o","a");//change the letters
        System.out.println(st1);//print the result

        //Преобразуйте строку к верхнему регистру.
        String stNew = st.toUpperCase(Locale.ROOT);//convert to uppercase
        System.out.println(stNew);//print the result

        //Преобразуйте строку к нижнему регистру.
        String stNew1 = st.toLowerCase();//convert to lowercase
        System.out.println(stNew1);//print the result

        //Вырезать строку Java c помощью метода substring().

        String stNew3 = st.substring(19,23);// cut out the word Java
        System.out.println(stNew3);// print the result

        //Проверить, заканчивается ли ваша строка подстрокой “!!!”.
        boolean yesorNo= st.endsWith("!!!");// checking
        System.out.println(yesorNo);// print the result

        //Проверить, начинается ли ваша строка подстрокой “I'm proud”.
        boolean yesorNo1 = st.startsWith("I'm proud");
        System.out.println(yesorNo1);



    }
}*/