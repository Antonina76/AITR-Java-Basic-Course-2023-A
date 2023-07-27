package dao;

import dao.model.Employee1;

public interface Company {
    //перечень действий = методов
    //берем на работу
    boolean addEmployee (Employee1 employee);//добавить сотрудника в компанию

    //увольнение
    Employee1 removeEmployee (int id);//удаляем сотрудника из компании

    // найти сотрудника по id
    Employee1 findEmployee (int id);//ищем сотрудника

    // размер компании
    int size ();
    //печатаем список компании
    void printEmployee();



}
