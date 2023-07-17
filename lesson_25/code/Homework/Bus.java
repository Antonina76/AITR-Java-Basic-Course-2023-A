package Homework;

public class Bus {
    //Создать класс Bus (автобус) - с полями номер маршрута, вместимость, скорость на маршруте,
    // длина маршрута.
    // Реализовать методы go, stop, speedUp, speedDown

    // fields
    public int routeNumber;
    public int capacity;
    public int speed;
    public double routeLength;

    //designer


    public Bus() {
    }

    public Bus(int routeNumber, int capacity, int speed, double routeLength) {
        this.routeNumber = routeNumber;
        this.capacity = capacity;
        this.speed = speed;
        this.routeLength = routeLength;
    }

    //getter and setter

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRouteLength() {
        return routeLength;
    }

    public void setRouteLength(double routeLength) {
        this.routeLength = routeLength;
    }

    //methods
    public void busGo(int speed) {
        if (speed > 0)
            System.out.println("The bus is starting to move !");
    }

    public void busStop(int speed) {
        if (speed <= 0)
            System.out.println("The bus stopped !");
        else {
            System.out.println("The bus moved !");
        }
        return;
    }
}