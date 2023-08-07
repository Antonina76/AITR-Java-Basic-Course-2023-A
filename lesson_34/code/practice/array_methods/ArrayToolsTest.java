package practice.array_methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.cats.Cat;
import practice.model.Soldier1;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer [] arrNum;
    String [] arrStr;
    Soldier1 [] soldiers;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9,7,4,7,2,5,9,1,0};
        arrStr = new String[]{"one","two","three","four","five"};
        soldiers = new Soldier1[]{
                new Soldier1("John",182,82.3,81),
                new Soldier1("Peter",182,77.1,92),
                new Soldier1("Robin",162,69.3,82),
                new Soldier1("Mary",159,55.1,91),
                new Soldier1("Anna",162,55.0,88)
        };
    }

    @Test
    void TestPrintArray() {
        System.out.println("=====testPrintArray===== ");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
        ArrayTools.printArray(soldiers);


    }

    @Test
    void TestSearchIndex() {
        System.out.println("=====testSearchArray===== ");
     //целые числа
      ArrayTools.printArray(arrNum);
       Integer res = ArrayTools.searchIndex(arrNum,7);
        System.out.println(res);
        assertEquals(1,res);
        System.out.println("===========");
        assertEquals(-1,ArrayTools.searchIndex(arrNum,100));
    //строки
        ArrayTools.printArray(arrStr);
        int index = ArrayTools.searchIndex(arrStr,"four");
        System.out.println(index);
        assertEquals(3,index);
        assertEquals(-1,ArrayTools.searchIndex(arrStr,"seven"));
    //Soldiers
        ArrayTools.printArray(soldiers);
        int indexSol = ArrayTools.searchIndex(soldiers,new Soldier1("Anna",162,55.0,88));
       assertEquals(4,indexSol);
    }

    @Test
    void searchBoolean() {
    }

    @Test
    void testFindByPredicate() {
        System.out.println("=====testFindByPredicate===== ");
        //для целых чисел...for integers
        ArrayTools.printArray(arrNum);
        Integer res = ArrayTools.findByPredicate(arrNum,n ->n>2 && n<7);
        System.out.println(res);
        res = ArrayTools.findByPredicate(arrNum,n-> n % 9==0);
        System.out.println(res);
        System.out.println("===========");
        //for String
      ArrayTools.printArray(arrStr);
      String str = ArrayTools.findByPredicate(arrStr,s -> s == "two");
        System.out.println(str);
        assertEquals("two",str);
        str = ArrayTools.findByPredicate(arrStr,s -> s.length()==3);
        System.out.println(str);
        System.out.println("============");
        //for Soldier
        ArrayTools.printArray(soldiers);
        Soldier1 sol = ArrayTools.findByPredicate(soldiers,soldier1 -> soldier1.getHeight()< 180 );
        System.out.println(sol);
        assertEquals(soldiers[1],sol);
    }
     @Test
    void testBabbleSort (){
         System.out.println("=====testBabbleSort===== ");
         //for integer
         ArrayTools.printArray(arrNum);
         ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);

         Integer[] expected = new Integer[] {0, 1, 2, 4, 5, 7, 7, 9, 9};
         assertArrayEquals(expected, arrNum);
         System.out.println("=================");
         //for String
         ArrayTools.printArray(arrStr);
         ArrayTools.bubbleSort(arrStr);
         ArrayTools.printArray(arrStr);
         String[] expected1= new String[] {"five", "four", "one", "three", "two"};
         assertArrayEquals(expected1, arrStr);
         //Soldiers
         ArrayTools.printArray(soldiers);
         ArrayTools.bubbleSort(soldiers);
         ArrayTools.printArray(soldiers);

     }
     @Test
    void TestBabbleSortByComparator(){
         System.out.println("=====testSoldiersByName====");
         ArrayTools.printArray(soldiers);
        Comparator<Soldier1>soldier1Comparator = new Comparator<Soldier1>() {
            @Override
            public int compare(Soldier1 o1, Soldier1 o2) {
              double compWeight = Double.compare(o1.getWeight(), o2.getWeight());
                int compHeight = o1.getHeight() - o2.getHeight();
                if (compWeight != 0) {
                    return (int) compWeight;
                } else if (compHeight != 0) {
                }
                return compHeight;
           }

        };
        Comparator<Integer>integerComparator =new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };
        ArrayTools.bubbleSort(soldiers,soldier1Comparator);
        ArrayTools.printArray(soldiers);

     }


}