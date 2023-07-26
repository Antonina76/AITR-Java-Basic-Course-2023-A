package HWShape;

import org.junit.jupiter.api.Test;
import practice.dao.model.Employee;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;

    @Test
    void calcPerimeterTest() {
        rectangle = new Rectangle(5.0,7.0);
        assertEquals(24.0,rectangle.calcPerimeter(5));
    }

    @Test
    void calcAreaTest() {
        rectangle = new Rectangle(5.0,7.0);
        assertEquals(35.0,rectangle.calcArea(5));
    }
}