package model2;

public class Computer {
    private String cpu;
    private int ram;
    private int ssd;
    private String brand;
    private long barcode;

     //designer


    public Computer(String cpu, int ram, int ssd, String brand, long barcode) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.barcode = barcode;
    }

    public Computer(String cpu, int ram, int ssd, long barcode) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.barcode = barcode;
        brand = "unknown";
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
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        return "Computer:" +
                "cpu: " + cpu + '\'' +
                ", ram: " + ram +
                ", ssd: " + ssd +
                ", brand: " + brand + '\'' +
                ", barcode=" + barcode;
    }
}
