package HWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;


    @Test
    void calcPerimeterTest() {
        square =new Square(5.0);
        assertEquals(20.0,square.calcPerimeter());
    }

    @Test
    void calcAreaTest() {
        square = new Square(5.0);
        assertEquals(25, square.calcArea());
    }
}