package Coffee;

public enum Coffee {
    ESPRESSO_SMALL(3.50,50),ESPRESSO_GRAND(4.0,150), AMERICANO(2.50,200), CAPPUCCINO(4.50,300), LATTE(4.50,350);
    private double price;
    private int volume;

    Coffee(double price, int volume) {
        this.price = price;
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}