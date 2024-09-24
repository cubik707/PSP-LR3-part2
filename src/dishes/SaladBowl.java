package dishes;

public class SaladBowl extends Plate {
    private double capacity; // Вместимость салатницы в литрах

    public SaladBowl(String manufacturer, double price, String style, double diameter, double capacity) {
        super(manufacturer, price, style, diameter);
        this.capacity = capacity;
    }

    public SaladBowl(String manufacturer, double price, double diameter) {
        this(manufacturer, price, "Неизвестно", diameter, 0.0);
    }

    public SaladBowl() {
        this("Неизвестно", 0.0, "Неизвестно", 0.0, 0.0);
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String getName() {
        return "Салатница";
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Вместимость: " + capacity + " л";
    }
}
