import dishes.Pan;
import dishes.Plate;
import dishes.Pot;
import utils.WriterInfo;

public class Main {
    public static void main(String[] args) {
        Pot pot = new Pot("Tefal", 1500.0, "Классический", 5.0, true);
        Pan pan = new Pan("Fissler", 2000.0, 20.5);
        Plate plate = new Plate("IKEA", 300.0, "Минимализм", 25.0);

        WriterInfo.printInfo(pot);
        WriterInfo.printInfo(pan);
        WriterInfo.printInfo(plate);
    }
}