package dishes;

import utils.Object;

public class Pan implements Dishes, Object {
    private String manufacturer;
    private double price;
    private String style;
    private double handleLength;
    private String coating;

    public Pan(String manufacturer, double price, String style, double handleLength, String coating) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.style = style;
        this.handleLength = handleLength;
        this.coating = coating;
    }

    public Pan(String manufacturer, double price, double handleLength) {
        this(manufacturer, price, "Неизвестно", handleLength, "Нет покрытия");
    }

    public Pan() {
        this("Неизвестно", 0.0, "Неизвестно", 0.0, "Нет покрытия");
    }

    public double getHandleLength() {
        return handleLength;
    }

    public String getCoating() {
        return coating;
    }

    @Override
    public String getName() {
        return "Сковорода";
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
                ", Длина ручки: " + handleLength + ", Покрытие: " + coating;
    }
}
