package dishes;

import utils.Object;

public abstract class Plate implements Dishes, Object {
    protected String manufacturer;
    protected double price;
    protected String style;
    private double diameter;

    public Plate(String manufacturer, double price, String style, double diameter) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.style = style;
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
    public String toString() {
        return "Производитель: " + manufacturer + ", Цена: " + price + ", Стиль: " + style + ", Диаметр: " + diameter;
    }
}
