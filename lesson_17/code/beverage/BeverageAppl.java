package beverage;

public class BeverageAppl {
    public static void main(String[] args) {
       Beverage bev1 = new Beverage();
       bev1.dysplayStock();
       bev1.toBuy("cola","bottle",5 );
       bev1.dysplayStock();
        Beverage bev2 = new Beverage();
        bev2.toBuy("Wine","box",2);
        bev2.dysplayStock();
        Beer beer1 = new Beer();
        beer1.toBuy("Beer","box",3,"black");
        beer1.dysplayStock();
    }
}

