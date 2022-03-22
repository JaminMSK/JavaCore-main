package HomeWork1.obstacle;

import HomeWork1.Participant;

/* Сделал Vladislav Torgashev
22.03.2022
 */

public class Bounce extends Obstacle {

    private int height;

    public Bounce(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }

}
