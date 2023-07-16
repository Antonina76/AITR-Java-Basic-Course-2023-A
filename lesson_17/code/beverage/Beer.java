package beverage;

public class Beer extends Beverage{
   String type; //white or dark
   //designer
    public Beer(String title, String packing, int quantity) {
        super(title, packing, quantity);

    }

    public Beer(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;
    }

    public Beer(String type) {
        this.type = type;
    }
    //Method for buying
    //мы переопределили родительский метод

    public void toBuy (String title, String packing,int quantity,String type){
    super.toBuy(title, packing, quantity);
    this.type = type;
    }
    //Method for what´s in stock
    //мы переопределили родительский метод
    public void dysplayStock (){
        super.dysplayStock();
        System.out.println("This is " + type + " beer. ");
    }
//пустой конструктор для класса  Beer
    public Beer() {
    }
}
