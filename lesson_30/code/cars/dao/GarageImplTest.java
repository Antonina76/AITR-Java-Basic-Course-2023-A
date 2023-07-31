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
        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("1234", "Toyota", 1.5, "red", "Garage1");
        cars[1] = new Car("23456", "VW", 2.0, "black", "Garage2");
        cars[2] = new Car("34567", "VW Up", 1.3, "weight", "Garage3");
        cars[3] = new Car("345678", "VW Up", 1.3, "weight", "Garage3");

        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }

        }
        @Test
        void addCar () {
           assertEquals(4,garage.size());
           assertFalse(garage.addCar(null));// you can´t add a null car
           assertFalse(garage.addCar(cars[0]));//you can´t add an existing car
           Car car1  = new Car("12345","Tesla",2.5,"yellow","Garage4");
           assertTrue(garage.addCar(car1));//adding the car to the garage
          assertEquals(5,garage.size());//checking the size of the garage
            Car car2  = new Car("1234598","Tesla",2.6,"yellow","Garage4");
            assertFalse(garage.addCar(car2));//exceeding the size of the garage
        }

        @Test
        void removeCar () {
        assertEquals(cars[2],garage.removeCar("34567"));//removing the car from the garage
        assertEquals(3,garage.size());//checking the size of the garage
        }

        @Test
        void findCarByRegNum () {
        assertEquals(cars[0],garage.findCarByRegNum("1234"));//finding the car in the garage
        assertEquals(null,garage.findCarByRegNum("10000"));//looking for a car that doesn´t exist
        }

        @Test
        void findCarsByModel () {
       Car [] expected = {cars[2],cars [3]};
        assertArrayEquals(expected,garage.findCarsByModel("VW Up"));

        }

        @Test
        void findCarsByCompany () {
            Car [] expected = {cars[2],cars [3]};
            Car [] actual = garage.findCarsByCompany("Garage3");
            assertArrayEquals(expected,actual);
        }

        @Test
        void findCarsByEngine () {
        }

        @Test
        void findCarsByColor () {
            Car [] expected = {cars[2],cars [3]};
            assertArrayEquals(expected,garage.findCarsByColor("weight"));

        }
    }
