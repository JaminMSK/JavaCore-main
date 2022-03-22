package Lesson1;



public class Cat extends Animal implements CanSwim{

    private boolean isWild;
    private double swimmingSpeed;

    public Cat (String name, String color, int age){
        super(name, color, age);
    }

    public void voice(){
        System.out.println("Кот мяукает");
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public double swim(Pool pool){
        System.out.println("Я кот! я плыву!");
        double timeToOvercome = pool.getLength() / swimmingSpeed;
        return timeToOvercome;
    }
}
