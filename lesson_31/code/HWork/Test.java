package HWork;

public class Test <T,U>{

    T obj1;
    U obj2;

    //constructor

    public Test(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    //to print objects of T and U
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);

    }
}
class Main {
    public static void main(String[] args) {
        Test<String,Integer>obj = new Test<String,Integer>("GfG",15);
        obj.print ();

    }
}