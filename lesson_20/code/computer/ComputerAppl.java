package computer;

import model.Computer;

public class ComputerAppl {
    public static void main(String[] args) {
        model.Computer comp1 = new Computer();
        comp1.setCpu("Intel");
        comp1.setRam(-16);
        comp1.setSsd(-512);
        System.out.println(comp1.toString());
        comp1.computerTurnOn();
        System.out.println(comp1);
        Computer computer = new Computer("int",16,512,"Lenovo","on");
        System.out.println(computer.toString());

    }
}

