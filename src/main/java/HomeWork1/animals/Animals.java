package HomeWork1.animals;

import HomeWork1.Participant;

/* Сделал Vladislav Torgashev
22.03.2022
 */

public abstract class Animals implements Participant {

    private String name;
    private boolean onDistance;
    private int maxDistanceRun;
    private int maxJumpHeight;
    private int maxDistanceSwim;

    public Animals(String name, int maxRunDistance,
                  int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxDistanceRun = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxDistanceSwim = maxSwimDistance;
        this.onDistance = true;
    }

    public boolean isOnDistance() {

        return onDistance;
    }

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxDistanceRun) {
            System.out.println(name + " успешно пробежал кросс");
        } else {
            System.out.println(name + " не справился с кроссом");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " перепрыгнул ");
        } else {
            System.out.println(name + " не прыгнул");
            onDistance = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (maxDistanceSwim == 0) {
            System.out.println(name + " не плавает");
            onDistance = false;
        } else if (distance <= maxDistanceSwim) {
            System.out.println(name + " переплыл");
        } else {
            System.out.println(name + " не переплыл");
            onDistance = false;
        }
    }

    @Override
    public String toString() {
        return name + " : " + (isOnDistance() ? "на дистанции" : "сошел с дистанции");
    }
}
