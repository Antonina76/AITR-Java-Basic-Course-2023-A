package cars.dao;

import cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {
    Garage garage;
    Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(4);
        cars = new Car[3];
        cars[0] = new Car("1234", "Toyota", 1.5, "red", "Garage1");
        cars[1] = new Car("23456", "VW", 2.0, "black", "Garage2");
        cars[2] = new Car("34567", "VW Up", 1.3, "weight", "Garage3");

        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }

        }
        @Test
        void addCar () {
           assertEquals(3,garage.size());
           assertFalse(garage.addCar(null));// you can´t add a null car
           assertFalse(garage.addCar(cars[0]));
           Car car1  = new Car("98765","Tesla",2.5,"yellow","Garage4");
           assertTrue(garage.addCar(car1));
           assertEquals(4,garage.size());
        }

        @Test
        void removeCar () {
        assertEquals(cars[2],garage.removeCar("34567"));
        assertEquals(2,garage.size());
        }

        @Test
        void findCarByRegNum () {
        assertEquals(cars[0],garage.findCarByRegNum("1234"));
        }

        @Test
        void findCarsByModel () {
        }

        @Test
        void findCarsByCompany () {
        }

        @Test
        void findCarsByEngine () {
        }

        @Test
        void findCarsByColor () {
        }
    }
