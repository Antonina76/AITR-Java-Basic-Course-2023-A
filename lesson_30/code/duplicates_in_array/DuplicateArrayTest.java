package duplicates_in_array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateArrayTest {
    DuplicateArray duplicateArray;

    @BeforeEach
    void setUp() {
        duplicateArray = new DuplicateArray();

    }

    @Test
    void displayDuplicatesTest() {
       //создаем массив с числами дубликатами внутри
       //вызываем метод из тестируемого класса
       //проверяем с помощью assert
        int[]arr = {5,4,5,3,2};
        assertEquals(2,duplicateArray.displayDuplicates(arr,5));
    }
}