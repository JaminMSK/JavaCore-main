package HomeWork_1.obstacle;

import HomeWork_1.Team;

/* Сделал Vladislav Torgashev
22.03.2022
 */

public class Course {
    private Obstacle obstacles[];

    public Course(Obstacle ... obstacles) {

        this.obstacles = obstacles;
    }
    public void doIt(Team team){
        for (Obstacle obstacle : obstacles) {
            team.doIt(obstacle);
        }
    }
}
