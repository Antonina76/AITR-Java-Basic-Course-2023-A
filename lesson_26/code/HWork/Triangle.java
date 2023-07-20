package HWork;

public class Triangle extends Shape {
    //fields
    double a;
    double b;
    double c;

    // designer

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    // getter and setter


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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    @Override
    public double calcPerimeter() {
        double p = (a+b+c);
        return p;
    }

    @Override
    public double calcArea() {
        double s;
        double p1 = (a+b+c)/2;
        s = Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c));
        return s;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

}
