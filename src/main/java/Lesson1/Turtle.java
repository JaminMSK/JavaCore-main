package Lesson1;

public class Turtle extends Animal implements CanSwim {

    private double swimmingSpeed;

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    public void voice() {
        System.out.println("Черепаха воет");
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public double swim(Pool pool) {
        System.out.println("Я череп! я плыву!");
        double timeToOvercome = pool.getLength() / swimmingSpeed;
        return timeToOvercome;
    }
}
