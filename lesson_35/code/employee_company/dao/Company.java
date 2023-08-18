package employee_company.dao;

import employee_company.model.Employee35;

public interface Company {
    boolean addEmployee(Employee35 employee);

    Employee35 removeEmployee(int id);

    Employee35 findEmployee(int id);

    int size();

    void printEmployees();



    int compareTo(Employee35 o1, Employee35 o2);
}

