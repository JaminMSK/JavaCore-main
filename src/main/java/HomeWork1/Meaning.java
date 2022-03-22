package HomeWork1;

import HomeWork1.animals.Mole;
import HomeWork1.animals.Moose;
import HomeWork1.animals.Ram;
import HomeWork1.animals.Wolverine;
import HomeWork1.obstacle.*;

public class Meaning {

    public static void main(String[] args) {

        Course c = new Course(new Obstacle[] {
                new Bounce(2),
                new Pool(5),
                new Run(7)});
        Team team = new Team("Звери",
                new Mole("Крот", 3, 0, 0),
                new Moose("Лосяш", 20, 5, 15),
                new Ram("Бараш", 9, 14, 7),
                new Wolverine("Логан", 1000, 1000, 1000));
        team.getTeamInfo();

        c.doIt(team);
        team.showResults();

    }
}
