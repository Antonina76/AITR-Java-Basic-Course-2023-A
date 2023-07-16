package model;
import model.Computer;
import java.util.Objects;

public class Computer {
    //class fields
    private String cpu;
    private int ram;
    private int ssd;
    private String brand;
    private String indicator;


    //designer

    public Computer(String cpu, int ram, int ssd, String brand, String indicator) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.indicator = indicator;
    }

    public Computer() {
    }
//getter and setter


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if(ram>0){
            this.ram = ram;
        }else {
            System.out.println("Wrong value!");
            return;
        }

    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        if (ssd>0){
            this.ssd = ssd;
        } else {
            System.out.println("Wrong value!");
            return;
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", " + " cpu: " + cpu + ", RAM:" + ram + " ,ssd " + ssd + " indicator " + indicator;
    }
    //метод для сравнения объектов


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Computer)){
            return false;
        }
        Computer other = (Computer) obj;
        return brand.equals(other.brand)&&cpu.equals(other.cpu)&&ram == other.ram&&ssd == other.ssd;
    }

    public void computerTurnOn (){
        indicator = "On";
        System.out.println("Computer is working....");
    }
    public void computerTurnOff (){
        indicator = "Off";
        System.out.println("Computer is NOT working...");
;    }


}

