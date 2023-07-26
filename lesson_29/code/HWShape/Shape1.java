package HWShape;

public abstract class Shape1 {
    //fields

    protected double x;

    //designer

    public Shape1(double x) {
    }

    //getter and setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    //methods

    public abstract double calcPerimeter (double x);

    public abstract double calcArea(double x);
}
