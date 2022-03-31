package HomeWork_3;

/* Сделал Vladislav Torgashev
31.03.2022
 */

public class Task {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        System.out.println("Вес ящика 1 (3 фрукта в ящике): " + box1.getWeight() + "f");

        Box<Orange> box2 = new Box<Orange>(orange1, orange2);
        System.out.println("Вес ящика 2 (2 фрукта в ящике): " + box2.getWeight() + "f");

        System.out.println();

        System.out.println("Сравните вес ящиков: ");
        System.out.println("Коробка с яблоками: " + box1.getWeight() + "f");
        System.out.println("Коробка с апельсинами: " + box2.getWeight() + "f");
        box2.add(orange3);
        System.out.println();
        System.out.println("Положите 1 апельсин в коробку 2 и вес составит: " + box2.getWeight() + "f");
        System.out.println();
        System.out.println("Сравните коробки: ");
        System.out.println("Коробка с яблоками: " + box1.getWeight()+ "f");
        System.out.println("Коробка с апельсинами: " + box2.getWeight()+ "f");


    }

}


