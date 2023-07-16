package practice.homework;

public class MeatFood extends Food {
    //class fields
    private String meatType;

    //designer


    public MeatFood(double price, String name, long barCode, String meatType) {
        super(price, name, barCode);
        this.meatType = meatType;
    }//designer without isOutOfDate

    public MeatFood(double price, String name, long barCode, boolean isOutOfDate, String meatType) {
        super(price, name, barCode, isOutOfDate);
        this.meatType = meatType;
    }
    //getter and setter

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }
    //_____Methods_________

    @Override
    public String toString() {
      return "price " + getPrice() + "," + "type " + getMeatType()+ ", name " + getName() + ", Barcode " + getBarCode() + "is out of date"+ isOutOfDate();
    }
}
