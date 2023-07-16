public class Weather {
    public static void main(String[] args) {
    //Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
        // Выведите на печать температуру, которая была во вторник и затем в четверг.
        // Найти среднюю температуру за прошлую неделю.
        double [] weather = new double[7];//declare and initiate an array
        weather[0] = 25;//setting the temperature
        weather[1] = 26;
        weather[2] = 28;
        weather[3] = 31;
        weather[4] = 29;
        weather[5] = 30;
        weather[6] = 24;
       System.out.println("It was " + weather[1] + " degrees on Tuesday. ");//print the result
       System.out.println("It was " + weather[3] + " degrees on Thursday. ");//print the result
        double sum = 0;//set the sum variable
        for (double i = 0; i < weather.length; i++)
            sum += weather[(int) i];//calculating the temperature for the week
        System.out.println("The average temperature for the week was " + sum/7);//print the average temp.for the week
    }
}
