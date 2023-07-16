package practice.homework;

import java.util.Objects;

public class Food extends Product {
    //class fields
    private boolean isOutOfDate;
  //  private int isOutOfDate1;


    //designer


    public Food(double price, String name, long barCode) {
        super(price, name, barCode);
    }//empty designer


    public Food(double price, String name, long barCode, boolean isOutOfDate) {
        super(price, name, barCode);
        this.isOutOfDate = isOutOfDate;
    }

    //getter and setter


    public boolean isOutOfDate() {
        return isOutOfDate;
    }

    public void setOutOfDate(boolean outOfDate) {
        isOutOfDate = outOfDate;
    }
    //____Methods______

    @Override
    public String toString() {
        return "Food " + "isOutOfDate=" + isOutOfDate +" price " + getPrice() + ", name " + getName() + ", Barcode " + getBarCode();
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
        if (!super.equals(o)) return false;
        Food food = (Food) o;
        return isOutOfDate == food.isOutOfDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isOutOfDate);
    }


}
