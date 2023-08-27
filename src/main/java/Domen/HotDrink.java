package Domen;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int price, int temperature) {
        super(name, price);
        if (temperature < 18) {
            this.temperature = 18;
        } else {
            this.temperature = temperature;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + " temperature=" + String.valueOf(this.temperature);
    }
}
