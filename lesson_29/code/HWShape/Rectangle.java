package HWShape;

public class Rectangle extends Shape1{
    double y;

    public Rectangle(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public double calcPerimeter(double x) {
        double p = 2* (x+y);
        return p;
    }

    @Override
    public double calcArea(double x) {
        double s = x * y;
        return s;
    }

}
