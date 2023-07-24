package company_employes.practice.dao;

import company_employes.practice.dao.model.Employee;

public class CompanyImpl implements Company {


    private  Employee [] employees;
    public  int size;
   //designer
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity]; // capacity становится длиной массива
    }
    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || size == employees.length ||findEmployee(employee.getId())!=null){
            return false;
        }
        employees [size] = employee;//добавление в конец массива
        size ++;
        return true;

    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees [i].getId () == id){
                return employees [i];
            }
        }
        return null;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public void printEmployee() {

    }
}
