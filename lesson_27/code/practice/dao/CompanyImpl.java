package practice.dao;

import practice.dao.model.Employee;

public class CompanyImpl implements Company{
    // поля о компании
    private Employee[] employees;
    private int size; // размер компании

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {

        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void printEmployee() {

    }
}
