package company_employes.practice.dao;

import company_employes.practice.dao.model.Employee;

public interface Company {
    //перечень действий = методов
    //берем на работу
    boolean addEmployee (Employee employee);//добавить сотрудника в компанию

    //увольнение
    Employee removeEmployee (int id);//удаляем сотрудника из компании

    // найти сотрудника по id
    Employee findEmployee (int id);//ищем сотрудника

    // размер компании
    int size ();
    //печатаем список компании
    void printEmployee();






}
