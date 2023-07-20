package HWork;

public abstract class Shape {
    //fields

    protected double x;

    //designer


    public Shape(double x) {
    }

    public Shape() {
    }

    //getter and setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    //methods

    public abstract double calcPerimeter ();

    public abstract double calcArea();
}
