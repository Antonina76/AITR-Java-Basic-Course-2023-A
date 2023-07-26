package HWShape;

import org.junit.jupiter.api.Test;
import practice.dao.model.Employee;

import static org.junit.jupiter.api.Assertions.*;

class TrapezoidTest {
    Trapezoid trapezoid;


    @Test
    void calcPerimeterTest() {
        trapezoid = new Trapezoid(4.0,5.0,7.0);
        assertEquals(22.0,trapezoid.calcPerimeter(4.0));
    }

    @Test
    void calcAreaTest() {
        trapezoid = new Trapezoid(4.0,5.0,7.0);
        assertEquals(27.5,trapezoid.calcArea(4.0));
    }
}