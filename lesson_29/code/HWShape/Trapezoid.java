package HWShape;

public class Trapezoid extends Shape1{
    double a; // the height of trapezoid
    double b; //the first base of trapezoid
    //designer
    public Trapezoid(double x, double a, double b) {// where x is the second base of trapezoid
        super(x);
        this.a = a;
        this.b = b;
    }
    //getter and setter
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calcPerimeter(double x) {
        double p = 2* (x + b);
        return p;
    }

    @Override
    public double calcArea(double x) {
        double s = (x + b)*a/2;
        return s;
    }

}
