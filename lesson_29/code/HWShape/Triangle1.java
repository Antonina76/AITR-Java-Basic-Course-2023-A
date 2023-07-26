package HWShape;

public class Triangle1 extends Shape1{
    //fields
    double a;
    double b;

    public Triangle1(double x, double a, double b) {
        super(x);
        this.a = a;
        this.b = b;
    }

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
       double p = a+b+x;
        return p;
    }

    @Override
    public double calcArea(double x) {
        double s;
        double p1 = (a+b+x)/2;
        s = Math.sqrt(p1*(p1-a)*(p1-b)*(p1-x));
        return s;
    }

}
