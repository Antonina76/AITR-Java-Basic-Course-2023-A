package practice1.array_methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Soldier[]soldiers;

    @BeforeEach
    void setUp() {
        soldiers = new Soldier[6];
        soldiers [0]= new Soldier("John",176.5,78.8,1);
        soldiers [1]= new Soldier("Patrick",180.0,80.0,2);
        soldiers [2]= new Soldier("Iwan",178.0,76.4,13);
        soldiers [3]= new Soldier("Michael",186.7,87.9,5);
        soldiers [4]= new Soldier("Peter",167.0,67,10);
        soldiers [5]= new Soldier("Herbert",189.5,89,97);
    }

    @Test
    void TestSearchIndex() {
        Integer res = ArrayTools.searchIndex(soldiers,5);







    }

    @Test
    void searchBoolean() {
    }

    @Test
    void findByPredicate() {
    }
    public static void printArray(Object[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("==============");
    }



}