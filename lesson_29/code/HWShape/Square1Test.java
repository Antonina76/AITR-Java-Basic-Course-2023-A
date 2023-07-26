package HWShape;

import org.junit.jupiter.api.Test;
import practice.dao.model.Employee;

import static org.junit.jupiter.api.Assertions.*;

class Square1Test {
    Square1 square1;

    @Test
    void calcPerimeterTest() {
        square1 = new Square1(5.0);
        assertEquals(20.0,square1.calcPerimeter(5));
    }

    @Test
    void calcAreaTest() {
        square1 = new Square1(5.0);
        assertEquals(25.0,square1.calcArea(5));
    }
}