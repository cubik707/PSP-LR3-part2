import dishes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pan pan = new Pan("Fissler", 2000.0, 20.5);
        Pot pot = new Pot("Tefal", 1500.0, "Классический", 5.0, true);
        System.out.println("Кастрюля:");
        pan.print();
        System.out.println("Сковорода:");
        pot.print();

        // Создаем объекты SaladBowl
        System.out.println("Создание объекта Салатница:");
        System.out.print("Введите производителя: ");
        String manufacturerSaladBowl = scanner.nextLine();
        System.out.print("Введите цену: ");
        double priceSaladBowl = scanner.nextDouble();
        System.out.print("Введите стиль: ");
        String styleSaladBowl = scanner.next();
        System.out.print("Введите диаметр: ");
        double diameterSaladBowl = scanner.nextDouble();
        System.out.print("Введите вместимость (л): ");
        double capacitySaladBowl = scanner.nextDouble();
        SaladBowl saladBowl = new SaladBowl(manufacturerSaladBowl, priceSaladBowl, styleSaladBowl, diameterSaladBowl, capacitySaladBowl);
        saladBowl.print();

        // Создаем объекты Saucer
        System.out.println("\nСоздание объекта Блюдце:");
        scanner.nextLine(); // Считываем оставшийся символ новой строки
        System.out.print("Введите производителя: ");
        String manufacturerSaucer = scanner.nextLine();
        System.out.print("Введите цену: ");
        double priceSaucer = scanner.nextDouble();
        System.out.print("Введите стиль: ");
        String styleSaucer = scanner.next();
        System.out.print("Введите диаметр: ");
        double diameterSaucer = scanner.nextDouble();
        System.out.print("Наличие декора (true/false): ");
        boolean hasDecor = scanner.nextBoolean();
        Saucer saucer = new Saucer(manufacturerSaucer, priceSaucer, styleSaucer, diameterSaucer, hasDecor);
        saucer.print();

        scanner.close();
    }
}