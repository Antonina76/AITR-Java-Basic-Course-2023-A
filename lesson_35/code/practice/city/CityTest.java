package practice.city;

import computer.CompAppl;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

    class CityTest {
        // вызвать тестируемый класс
        City[] cities;

        @BeforeEach
        void setUp() {
            // создать тестовый набор данных

            cities = new City[6]; // создаем массив

            cities[0] = new City("Denver", 600_000);
            cities[1] = new City("Boston", 670_000);
            cities[2] = new City("Chicago", 2_700_000);
            cities[3] = new City("Atlanta", 470_000);
            cities[4] = new City("New York", 8_500_000);
            cities[5] = new City("Dallas", 1_300_000);
        }
        //будем искать город в массиве городов методом BinarySearch и смотреть что вернет
//BinarySearch можно применять только к сортированным массивам
// метод для печати массива + строка-анонс списка
        @Test
        void testBinarySearch(){
            printArray(cities,"Original Array");
            Arrays.sort(cities);
            printArray(cities,"Array sorted");
            //теперь можем применять BinarySearch
            City pattern = new City(null,1_200_000);

          int index = Arrays.binarySearch(cities,pattern);
            System.out.println("index = " + index);

        }
        @Test
        void testBinarySearch1(){
            printArray(cities,"Original Array");
          Comparator<City>cityComparator = new Comparator<City>() {
           @Override
           public int compare(City o1, City o2) {
            return o1.getName().compareTo(o2.getName());
            }
          };


          // Comparator <City>cityComparator = (c1,c2) -> c2.getName().compareTo(c2.getName());
        //   Comparator<City>cityComparator = Comparator.comparing(City::getName);//сравниваем объекты класса City по именам
            Arrays.sort(cities,cityComparator);
            printArray(cities,"Sorted by name");
            City pattern = new City("Chicago",0);
            int index = Arrays.binarySearch(cities,pattern,cityComparator);//find by name
            System.out.println(index);
        }
//увеличиваем массив в два раза
        @Test
        void testArrayCopy(){
            printArray(cities, "Original Array");
            City[]citiesCopy = Arrays.copyOf(cities, cities.length*2);
            printArray(citiesCopy,"citiesCopy before sorting");
            //пытаемся отсортировать новый массив, натуральным способом
           // Arrays.sort(citiesCopy);
           // printArray(citiesCopy, "Array after sorting");//
            Comparator<City>cityComparator = new Comparator<City>() {
                @Override
                public int compare(City o1, City o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            };

            Arrays.sort(citiesCopy,0,cities.length,cityComparator);
            printArray(citiesCopy,"citiesCopy sorted");
        }


        private void printArray(Object[] arr, String title) {
    System.out.println("===== " + title + " =====");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
        }

    }



