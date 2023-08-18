package employee_company.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class Employee35Test {
    Employee35[] employees;

    @BeforeEach
    void setUp() {
        employees = new Employee35[5];
        employees[0] = new Engineer(101L, "John", 35, 7, "1-phd", 1000.0, 5, 160);
        employees[1] = new Engineer(102L, "Ann", 30, 5, "2-university", 900.0, 4, 160);
        employees[2] = new Worker(103L, "Peter", 45, 4, "3-hight school", 850.0, 160);
        employees[3] = new Worker(104L, "Robin", 28, 5, "4- real school", 750.0, 160);
        employees[4] = new Worker(105L, "Mike", 20, 3, "4-real school", 600.0, 160);

    }

    @Test
    void testSortByExperience() {
        Comparator<Employee35> employee35Comparator = new Comparator<Employee35>() {
            @Override
            public int compare(Employee35 o1, Employee35 o2) {
                return o1.getExperience() - o2.getExperience();
            }
        };
        printArray(employees);
        Arrays.sort(employees, employee35Comparator);
        printArray(employees);

    }

    @Test
    void testSortByName() {
        Comparator<Employee35> employee35Comparator1 = new Comparator<Employee35>() {
            @Override
            public int compare(Employee35 o1, Employee35 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
       printArray(employees);
        Arrays.sort(employees,employee35Comparator1);
        printArray(employees);

    }

    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("==============");
    }
}



