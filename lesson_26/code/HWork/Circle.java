package HWork;

public class Circle extends Shape {
    //fields
    double radius;

    //designer


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double calcPerimeter() {
        return 0;
    }

    @Override
    public double calcArea() {
        double s = 3.14 * (radius*radius);
        if (radius>0){
        }
        return s;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

}



