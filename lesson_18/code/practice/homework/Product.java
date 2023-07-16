package practice.homework;

import java.util.Objects;

public class Product {
    //Создать класс Product, с полями
    //private double price; private String name; private long barCode;
    //Создать класс Food расширяющий класс Product с полем private boolean isOutOfDate;,
    // которое отвечает за годность продукта.
    //Создать класс MeatFood расширяющий класс Food с полем private String meatType;,
    // которое хранит тип мяса, из которого изготовлен продукт.
    //Создать класс MilkFood расширяющий класс Food с полями
    // private String milkType; private double fat;,
    // которые хранят тип молока и жирность продукта соответственно.
    //Во всех классах переопределить метод toString.
    //В классе ProductsAppl создать в методе main создать массив,
    // в котором хранятся как минимум по одному объекту для каждого продукта.
    // Создать метод печатающий все продукты из массива, и метод возвращающий
    // сумму цен всех продуктов в магазине.

    //class fields
    private double price;
    private String name;
    private long barCode;


    //designer

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }
    //getter and setter

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }
    //______Methods______


    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }


    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }//method for print array


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return (barCode == product.barCode);//simplified to a bar cod

    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, barCode);
    }


}