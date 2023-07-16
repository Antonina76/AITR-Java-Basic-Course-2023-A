import java.util.Scanner;
public class String_1 {
    public static void main(String[] args) {
    //Пользователь вводит строку. Распечатайте каждую букву строки на новой строчке.
      Scanner scanner = new Scanner(System.in);
      String s = scanner.nextLine();
        System.out.println("String : " + s);
      int l = s.length();// length of string
        System.out.println("Length of string: " + l);
      int pointer = 0;
        while (l>0){
          System.out.println(s.charAt(pointer));
          pointer ++;//двигаем указатель по строку вправо
          l--;// уменьшаем длину строки
      }//end of while
        System.out.println(pointer);
    }
}
