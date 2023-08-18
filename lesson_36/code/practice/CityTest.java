package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CityTest {
    // вызвать тестируемый класс
   City[]cities;
    @BeforeEach
    void setUp() {
        cities = new City[6]; // создаем массив
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }

    @Test
    void  testCopyOfRange(){
        printArray(cities,"Original Array");
        City[]citiesCopyRange = Arrays.copyOfRange(cities,1,cities.length-1);
        printArray(citiesCopyRange,"Copy Array");

    }
    @Test
    void testSystemArrayCopy(){
        printArray(cities,"Original Array");
        City[]citiesCopy = new City[cities.length*2];
        System.arraycopy(cities,1,citiesCopy,2,cities.length-2);
        printArray(citiesCopy,"Array citiesCopy");

    }
    @Test
    void testInsertAndKeepSorted(){
        printArray(cities,"Original array");
        Arrays.sort(cities);
        printArray(cities,"Array after natural sorting");
        City city = new City("San  Francisco",690_000);
       //нужно откопировать массив в новый массив с длиной плюс 1
       //после этого найти индекс для вставляемого города с помощью BinarySearch
       // определит реальный индекс на какое место вставлять новый город
       //сдвинуть весь массив вправо на одну позицию, освободив тем самым место для нового города
       //вставить новый город на освободившееся нужное место
       //сделать массив опят с именем  cities
       //напечатать полученый массив
       City[]citiesCopy1 = Arrays.copyOf(cities,cities.length+1);
       int index = Arrays.binarySearch(citiesCopy1,0,cities.length-1,city);
        System.out.println(index);
        index = index >=0 ? index : -index-1;//позиция куда вставлять
        System.out.println(index);
        System.arraycopy(citiesCopy1,index,citiesCopy1,index+1,citiesCopy1.length-index-1);
        citiesCopy1[index] = city;
        cities = citiesCopy1;
        printArray(cities,"Array Copy after insert new City");

    }
    private void printArray(Object[] arr, String title) {
        System.out.println("===== " + title + " =====");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

