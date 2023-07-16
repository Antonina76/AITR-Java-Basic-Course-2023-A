package controller2;

import model2.Stock;
import model2.Computer;

public class StockAppl {
    public static void main(String[] args) {
        Stock stock = new Stock(2000);
        stock.addComp(new Computer("int",8,512,"Lenovo",123456789));
        stock.addComp(new Computer("int",6,256,"Asus",123456788));
        stock.addComp(new Computer("int",8,512,"MacBookPro",123456787));
        stock.addComp(new Computer("int",8,256,"Lenovo",123456786));
        stock.addComp(new Computer("int",8,512,"MacBookAir",123456785));
        System.out.println(stock.getSize());
        System.out.println(stock.findComp(123456789));
        System.out.println(stock.findCompBrand("MacBookPro"));
     //   System.out.println(stock.removeComp(123456789,));

    }
}
