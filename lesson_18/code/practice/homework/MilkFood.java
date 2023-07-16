package practice.homework;

public class MilkFood extends Food{
    //class fields
    private String milkType;
    private double fat;
    //designer

    public MilkFood(double price, String name, long barCode, String milkType, double fat) {
        super(price, name, barCode);
        this.milkType = milkType;
        this.fat = fat;
    }//designer without isOutOfDate

    public MilkFood(double price, String name, long barCode, boolean isOutOfDate, String milkType, double fat) {
        super(price, name, barCode, isOutOfDate);
        this.milkType = milkType;
        this.fat = fat;
    }
    //getter and setter

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }
    //_____Methods_____

    @Override
    public String toString() {
        return "price " + getPrice() + "," + "type " + getMilkType()+ ", name " + getName() + ", Barcode " + getBarCode() + ", fat " +  getFat()+" is out of date"+ isOutOfDate();
    }
}
