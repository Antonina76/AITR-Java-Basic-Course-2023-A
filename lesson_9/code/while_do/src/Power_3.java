public class Power_3 {
    public static void main(String[] args) {
        //Возведите 3 в степень 10, выведите все промежуточные результаты.
        int power = 1;
        int result = 1;

        do {
        result = result*3;//возведение в степень
            power ++;//меняем счетчик он же параметр
            System.out.println(result);
        } while (power<=10);
    }
}
