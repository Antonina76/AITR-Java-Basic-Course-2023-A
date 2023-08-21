package HW39;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationTest {

    @Test
    void getAge() {
        assertEquals(47,DateOperation.getAge("19/04/1976"));
    }

    @Test
    void sortStringDates() {
        String[]dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[]expected = {"1970-08-12", "2000-12-01", "10/12/2000", "2010-10-05"};
        String[]actual = DateOperation.sortStringDates(dates);
        assertArrayEquals(expected,actual);
    }
}