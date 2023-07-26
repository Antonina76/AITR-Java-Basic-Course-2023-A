package HWShape;

import org.junit.jupiter.api.Test;
import practice.dao.model.Employee;

import static org.junit.jupiter.api.Assertions.*;

class Triangle1Test {
    Triangle1 triangle1;

    @Test
    void calcPerimeter() {
        triangle1 = new Triangle1(5.0,6.0,7.0);
        assertEquals(18,triangle1.calcPerimeter(5));
    }

    @Test
    void calcArea() {
        triangle1 = new Triangle1(5.0,6.0,7.0);
        assertEquals(14.696938456699069,triangle1.calcArea(5));
    }
}