package practice.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRandomTest {
    ArrayRandom arrayRandom;

    @BeforeEach
    void setUp() {
        arrayRandom = new ArrayRandom();
    }

    @Test
    void zeroCountTest() {
        int [] num = {-5,2,8,10,0,9,4};
        assertEquals(1,arrayRandom.zeroCount(num));
    }

    @Test
    void positiveCountTest() {
        int [] num = {-5,2,8,10,0,9,4};
        assertEquals(5,arrayRandom.positiveCount(num));
    }

    @Test
    void evenCount() {
        int [] num = {-5,2,8,10,0,9,4};
        assertEquals(5,arrayRandom.evenCount(num));
    }

    @Test
    void negCount() {
        int [] num = {-5,2,8,10,0,9,4};
        assertEquals(1,arrayRandom.negCount(num));
    }
}