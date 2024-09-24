package utils;

public class WriterInfo {
    public static void printInfo(Dishes dish) {
        System.out.println("Информация о посуде:");
        System.out.println(dish.getName() + " - " + dish);
        System.out.println();
    }
}
