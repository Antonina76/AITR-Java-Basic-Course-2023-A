package computer;

public class CompAppl {
    public static void main(String[] args) {
    //создаем объектную переменную класса Computer с полями и их значениями
        Computer comp1 = new Computer("i5 ",16,512,"HP");
        comp1.display();
        System.out.println();
        Computer comp2 = new Computer("i5 ",16,512,"Asus");
        comp2.display();
        System.out.println();
        Laptop lap1 = new Laptop(" i7 ", 32,1024," Acer, ", 13,2, " black. ");
        lap1.display();

    }

}
