package dishes;

public class Pan extends Dishes {
    private double handleLength;
    private String coating;

    public Pan(String manufacturer, double price, String style, double handleLength, String coating) {
        super(manufacturer, price, style);
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
    public String toString() {
        return super.toString() + ", Длина ручки: " + handleLength + ", Покрытие: " + coating;
    }
}
