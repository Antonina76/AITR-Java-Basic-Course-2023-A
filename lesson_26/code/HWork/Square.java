package HWork;

public class Square extends Shape{
    double a;//square side
    //

    public Square(double a) {
        this.a = a;
    }


    //getter and setter

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double calcPerimeter() {
        double per = 4*a;
        if (a>0){
        }
        return per;
    }

    @Override
    public double calcArea() {
        double p = a*a;
        if (a>0){
        }
        return p;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

}
