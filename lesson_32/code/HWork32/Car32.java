package HWork32;

import java.util.Objects;

public class Car32 implements Comparable <Car32>{
    private   String model;
    private   double engine;
    private   String company;
    private long mileage;
//constructor

    public Car32(String model, double engine, String company, long mileage) {
        this.model = model;
        this.engine = engine;
        this.company = company;
        this.mileage = mileage;
    }


    //getter and setter


    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Car32{" + "model=" + model + ", engine=" + engine + ", company=" + company + ", mileage=" + mileage + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car32 car32 = (Car32) o;
        return Double.compare(car32.engine, engine) == 0 && mileage == car32.mileage && Objects.equals(model, car32.model) && Objects.equals(company, car32.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, engine, company, mileage);
    }

    @Override
    public int compareTo(Car32 o) {
       return (int) (o.mileage - this.mileage);
        // return this.company.compareTo(o.company);
       // return this.model.compareTo(o.model);
    }
}
