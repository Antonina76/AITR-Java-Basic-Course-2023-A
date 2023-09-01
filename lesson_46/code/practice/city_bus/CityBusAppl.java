package practice.city_bus;

import practice.city_bus.model.Bus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CityBusAppl {
    public static void main(String[] args) {
        //создадим список городских маршрутов
        //вывести его на печать в отсортированном виде
        //подсчитать общее кол-во перевозимых за день пассажиров
        List<Bus> cityBuses = new ArrayList<Bus>();
        cityBuses.add(new Bus("Scania","1000AG","100",90));
        cityBuses.add(new Bus("Man","2000AG","100A",100));
        cityBuses.add(new Bus("Mercedes","5000AG","25",105));
        cityBuses.add(new Bus("Ikarus","3000AG","B",80));


        Bus bus1 = new Bus("Mann","2000AG","100A",100);
       cityBuses.add(bus1);
        System.out.println( cityBuses.size());
        int index = cityBuses.indexOf(bus1);
        System.out.println(index);
        System.out.println(cityBuses.get(1));
        System.out.println(cityBuses.get(4));
        System.out.println("=============");
        for (Bus bus:cityBuses) {
            System.out.println(bus);
        }

                System.out.println("======================");
        cityBuses.sort(Bus::compareTo);//sort array
        for (Bus bus: cityBuses) {
            System.out.println(bus);
        }
        System.out.println("======Capacity=======");
        int totalCapacity = 0;
        for (Bus bus :cityBuses) {
            totalCapacity+= bus.getCapacity();

        }
        System.out.println(totalCapacity);
        System.out.println("==================");
        Bus busToEdit = cityBuses.get(4);
        System.out.println(busToEdit);
        busToEdit.setModel("Ykarus");
        System.out.println(busToEdit);
        System.out.println("==================");
        for (Bus bus : cityBuses) {
            System.out.println(bus);
        }
    }
}
