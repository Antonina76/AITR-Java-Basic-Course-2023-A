import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("String praxis");
        String st = "I like Java! Java is the best way to earn good salary in IT. ";
     //распечатать последний символ строки
      int l =st.length();//определяем длину
        System.out.println("Length of string is " + l); //выводим длину строки
        System.out.println(st);
        char lastSymbol = st.charAt(59);//узнали последний символ
        System.out.println("Last symbol is " + lastSymbol);
        //Найти позицию подстроки "Java" в строке "I love Java"
        String st1 = "I like Java";//задали строку
        int index = st1.indexOf("Java");// находим индекс слова Джава
        int index1 = st1.indexOf("like");
        System.out.println("like starts from index " + index1);// печатаем результат
        //проверить содержит ли заданная строка подстроку "Джава", используем метод String.contains
        boolean yesorNo= st.contains("Java");
        System.out.println(yesorNo);//печатаем результат
        //заменить все "а" на "о"
        String stNew = st.replace("a","o");
        System.out.println(stNew);
        //преобразуйте строку к верхнему  и нижнему регистру
        String stNew1 = st.toLowerCase();
        System.out.println(stNew1);
        String stNew2 = st.toUpperCase();
        System.out.println(stNew2);

        //вырезать строку Java с помощью метода String.substring
        String stNew3 = st.substring(7, 11);//вырезаем
        System.out.println(stNew3); // печатаем
        // проверить заканчивается ли ваша строка "!!!"
        String stNew4 = "I like Java!!!";

        yesorNo = stNew4.endsWith("!!!");

        System.out.println(yesorNo);

    }
}