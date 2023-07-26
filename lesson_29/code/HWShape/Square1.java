package HWShape;

public class Square1 extends Shape1{
   //designer
    public Square1(double x) {
        super(x);
    }


    @Override
    public double calcPerimeter(double x) {
        double per = 4 * x;
        if (x > 0) {
        }
        return per;
    }
    @Override
    public double calcArea(double x) {
        double p = x*x;
        if (x>0){
        }
        return p;
    }

}
