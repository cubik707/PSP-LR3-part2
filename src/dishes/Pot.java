package dishes;

public class Pot extends Dishes {
    private double volume;
    private boolean hasLid;

    public Pot(String manufacturer, double price, String style, double volume, boolean hasLid) {
        super(manufacturer, price, style);
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
    public String toString() {
        return super.toString() + ", Объем: " + volume + ", Наличие крышки: " + (hasLid ? "Да" : "Нет");
    }
}
