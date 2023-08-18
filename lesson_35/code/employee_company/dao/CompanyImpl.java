package employee_company.dao;

import employee_company.model.Employee35;

public  class CompanyImpl implements Company {
    // заводим массив под сотрудников
    private Employee35[] employees;

    // кол-во сотрудников
    private int size;

    // метод constructor, который получив на вход capacity определяет размер массива employees
    public CompanyImpl(int capacity) {
        employees = new Employee35[capacity];
    }

    // метод, который добавляет нового сотрудника в массив
    @Override
    public boolean addEmployee(Employee35 employee) {
        // если сотрудник не null ИЛИ size еще не равен длине массива ИЛИ такой сотрудник уже есть, ТО
        if (employee == null || size == employees.length || findEmployee((int) employee.getId()) != null) {
            return false; // возвращаем false, т.к. сотрудника  нельзя добавить!
        }
        employees[size++] = employee; // добавляем сотрудника в массив и увеличиваем size на единицу
        return true; // возвращаем true
    }

    // метод, который удаляет сотрудника из массива по его id
    @Override
    public Employee35 removeEmployee(int id) { // получили на вход id
        for (int i = 0; i < size; i++) { // перебираем весь массив
            if (employees[i].getId() == id) { // находим жертву по его id
                Employee35 victim = employees[i]; // в объект victim кладем найденного
//                employees[i] = employees[size - 1];
//                employees[size - 1] = null;
//                size--;
                employees[i] = employees[--size]; // берем последнего в списке и ставим его на место найденного
                employees[size] = null; // последнего в списке делаем null
                return victim; // возвращаем найденный объект
            }
        }
        return null;
    }

    // метод для поиска сотрудника по его id
    @Override
    public Employee35 findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }


    // метод для печати
    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }


    @Override
    public int compareTo(Employee35 o1, Employee35 o2) {
        return o1.getExperience()-o2.getExperience();
    }


}



