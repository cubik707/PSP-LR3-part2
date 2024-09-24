package dishes;

public class Saucer extends Plate {
    private boolean hasDecor; // Наличие декора на блюдце

    public Saucer(String manufacturer, double price, String style, double diameter, boolean hasDecor) {
        super(manufacturer, price, style, diameter);
        this.hasDecor = hasDecor;
    }

    public Saucer(String manufacturer, double price, double diameter) {
        this(manufacturer, price, "Неизвестно", diameter, false); // По умолчанию без декора
    }

    public Saucer() {
        this("Неизвестно", 0.0, "Неизвестно", 0.0, false);
    }

    public boolean hasDecor() {
        return hasDecor;
    }

    @Override
    public String getName() {
        return "Блюдце";
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Наличие декора: " + (hasDecor ? "Да" : "Нет");
    }
}
