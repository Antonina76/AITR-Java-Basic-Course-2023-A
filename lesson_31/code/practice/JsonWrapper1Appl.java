package practice;

public class JsonWrapper1Appl {
    public static void main(String[] args) {
    //Generics - параметры для классов и методов
    //{имя: Леонид; возраст - 59;....} - так выглядит обычно Json
    // {value: 60}
    JsonWrapper1 wrapper1 = new JsonWrapper1("60");
        System.out.println(wrapper1);
      int a= (int) wrapper1.getValue();

    }


}
