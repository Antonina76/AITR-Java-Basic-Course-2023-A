package HWShape;

import org.junit.jupiter.api.Test;
import practice.dao.model.Employee;

import static org.junit.jupiter.api.Assertions.*;

class Circle1Test{
    Circle1 circle1;

    @Test
    void calcAreaTest() {
        circle1 = new Circle1(5.0);
        assertEquals(78.53981633974483,circle1.calcArea(5.0));

    }
}