package HWork32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

    class Car32Test {
        Car32[] car32;


        @BeforeEach
        void setUp() {

            car32 = new Car32[]{


                    new Car32("Toyota", 2.8, "RSVG", 20000L),
                    new Car32("VW", 1.8, "BVG", 180000L),
                    new Car32("Nissan", 1.3, "BBG", 15000L),
                    new Car32("Toyota", 1.9, "BBVG", 21200L),
            };
        }

    @Test
    void carSortTestModel(){
        System.out.println("==========Cars unsorted===========");
        printArray(car32);
        Arrays.sort(car32);
        System.out.println("==========Cars sorted by company=======");
        printArray(car32);
    }
    @Test
    void carSortTestMileage (){
        System.out.println("==========Cars unsorted===========");
        printArray(car32);
        Arrays.sort(car32);
        System.out.println("==========Cars sorted by mileage=======");
        printArray(car32);
    }

    @Test
    void carSortComparator(){
        System.out.println("=====Cars unsorted=====");
        printArray(car32);
        Comparator<Car32>car32Comparator=new Comparator<Car32>() {
            @Override
            public int compare(Car32 o1, Car32 o2) {
                return Double.compare(o1.getEngine(),o2.getEngine());
            }
        };
        Arrays.sort(car32,car32Comparator);
        System.out.println("=====Cars sorted by engine=====");
        printArray(car32);
    }


        public void printArray (Object[]arr){
            for (int i = 0; i <arr.length ;i++) {
                System.out.println(arr[i]);
            }
        }


}
