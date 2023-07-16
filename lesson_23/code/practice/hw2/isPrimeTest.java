package practice.hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isPrimeTest {
    isPrime isPrime;

    @BeforeEach
    void setUp() {
        isPrime = new isPrime();
    }

    @Test
    void isPrimeNumberTest() {
        int n = 2;
        assertTrue(isPrime.isPrimeNumber(n));

    }
}