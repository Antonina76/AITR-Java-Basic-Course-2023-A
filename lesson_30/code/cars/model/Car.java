package cars.model;

import java.util.Objects;

public class Car {
   private String regNumber;
  private   String model;
  private   double engine;
  private   String color;
  private   String company;

    //designer

    public Car(String regNumber, String model, double engine, String color, String company) {
        this.regNumber = regNumber;
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.company = company;
    }

    //getter


    public String getRegNumber() {
        return regNumber;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getCompany() {
        return company;
    }
    //setter

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car:" +
                "regNumber='" + regNumber + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;//кастим объект О в объект car
        return Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }
}
