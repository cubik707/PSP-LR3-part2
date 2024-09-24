package dishes;

import utils.Object;

public class Pot implements Dishes, Object {
    private String manufacturer;
    private double price;
    private String style;
    private double volume;
    private boolean hasLid;

    public Pot(String manufacturer, double price, String style, double volume, boolean hasLid) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.style = style;
        this.volume = volume;
        this.hasLid = hasLid;
    }

    public Pot(String manufacturer, double price, double volume) {
        this(manufacturer, price, "Неизвестно", volume, false);
    }

    public Pot() {
        this("Неизвестно", 0.0, "Неизвестно", 0.0, false);
    }

    public double getVolume() {
        return volume;
    }

    public boolean hasLid() {
        return hasLid;
    }

    @Override
    public String getName() {
        return "Кастрюля";
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Производитель: " + manufacturer + ", Цена: " + price + ", Стиль: " + style +
                ", Объем: " + volume + ", Наличие крышки: " + (hasLid ? "Да" : "Нет");
    }
}
