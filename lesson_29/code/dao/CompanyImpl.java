package dao;

import dao.model.Employee;

public class CompanyImpl implements Company {


    private  Employee[] employees;
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
       // алгоритм удаления сотрудника из массива по его ID
       //ищем в цикле по всем employee (или обегаем массив)
       //если нашелся сотрудник с заданным ИД: 1.сохранить удаляемого сотрудника (victim) в объектную переменную
       //2. на место удаленного сотрудника переносим последнего в массиве сотрудника
       //3. последнего затираем с помощью ссылки null
       //4. size --, уменьшаем размер массива
        for (int i = 0; i < employees.length; i++) {
            if (employees [i].getId() == id){
                Employee victim = employees [i];
                employees [i] = employees [size -1];
                employees [size - 1] = null;
                size --;
                return victim;
            }
        }
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
