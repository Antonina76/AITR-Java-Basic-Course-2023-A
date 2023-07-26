package HWShape;

public class Circle1 extends Shape1{
    double radius = x;

    //designer

    public Circle1(double x) {
        super(x);
    }

    @Override
    public double calcPerimeter(double x) {
        return 0;
    }


    @Override
    public double calcArea(double x) {
        double s = Math.PI*(x*x);
            return s;
    }

}
