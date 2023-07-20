package HWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle;

    @Test
    void calcPerimeter() {
        triangle = new Triangle(5.0,6.0,7.0);
        assertEquals(18,triangle.calcPerimeter());
    }

    @Test
    void calcArea() {
        triangle = new Triangle(5.0,6.0,7.0);
        assertEquals(14.696938456699069,triangle.calcArea());
    }
}