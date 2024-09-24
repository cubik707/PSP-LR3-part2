package dishes;

public class Plate extends Dishes {
    private double diameter;

    public Plate(String manufacturer, double price, String style, double diameter) {
        super(manufacturer, price, style);
        this.diameter = diameter;
    }

    public Plate(String manufacturer, double price, double diameter) {
        this(manufacturer, price, "Неизвестно", diameter);
    }

    public Plate() {
        this("Неизвестно", 0.0, "Неизвестно", 0.0);
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public String getName() {
        return "Тарелка";
    }

    @Override
    public String toString() {
        return super.toString() + ", Диаметр: " + diameter;
    }
}
