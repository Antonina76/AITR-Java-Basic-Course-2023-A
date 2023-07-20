package HWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle;

    @Test
    void calcPerimeter() {
    }

    @Test
    void calcArea() {
        circle = new Circle(10);
        assertEquals(314.00,circle.calcArea());
}
}