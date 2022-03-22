package HomeWork_1.obstacle;

import HomeWork_1.Participant;

/* Сделал Vladislav Torgashev
22.03.2022
 */

public class Pool extends Obstacle{

    private int length;

    public Pool(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(length);
    }

}
