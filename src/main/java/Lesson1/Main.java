package Lesson1;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Барсик", "black", 2);

        System.out.println(cat);

        Cat cat1 = new Cat("Мурзик", "white", 3);
        Cat cat2 = new Cat("Мурзик", "white", 3);

        System.out.println(cat1.equals(cat2));

        Cat cat3 = new Cat("Мурзик", "white", 1);

        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());

        Wolf wolf = new Wolf("Гарик", "gray", 6);

        Animal cat4 = new Cat("Борис", "ginger", 4);

        if(cat4 instanceof Wolf){
            Wolf wolf5 = (Wolf) cat4;
        }
        else System.out.println("Не является волком!");

        System.out.println(wolf);

        Cat cat5 = new Cat("Мурзио", "white", 3);

        cat5.setAge(3);

        System.out.println(cat5);

        cat5.setAge(-1);

        System.out.println(cat5);
    }
}
