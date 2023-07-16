package homework_1;

public class Dobermann extends Dog {

    //designer

    public Dobermann(String name, double weight, String breed, int age) {
        super(name, weight, breed, age);
    }

    //Method
    @Override
    public void voice (){
        super.voice();
        System.out.println("Hello world from Dobermann klass! ");
    }

}
