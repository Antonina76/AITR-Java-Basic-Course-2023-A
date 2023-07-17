package hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Hw1Test {
    Hw1 hw1;

    @BeforeEach
    void setUp() {
        hw1 = new Hw1();
    }

    @Test
    void rootTest () {
        double a = 2.0;
        double b = 1.0;
        double c = 2.0;

        assertEquals (- 15,hw1.root(2,1,2) );
    }

    @Test
    void root1Test () {
        double a = 1.0;
        double b = 0.0;
        double c = 2.0;

        assertEquals(-8,hw1.root1(1,0,2));
    }
}