package homework_1;

public class Dog {
   String name;
   double weight;
   String breed;
   int age;
   //designer


    public Dog(String name, double weight, String breed, int age) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
        this.age = age;
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //_____method_____
    public void voice (){
        System.out.println("Hello world from Dog klass!");
    }
}
