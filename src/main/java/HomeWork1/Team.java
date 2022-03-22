package HomeWork1;

import HomeWork1.animals.Mole;
import HomeWork1.animals.Moose;
import HomeWork1.animals.Ram;
import HomeWork1.animals.Wolverine;
import HomeWork1.obstacle.Obstacle;

public class Team {
    private String name;
    private Participant participants[] ;

    public Team(String name) {

        this.name = name;
    }

    public Team(String name,Participant ... participantsGiven ) {
        this.name = name;
        this.participants = participantsGiven;
    }

    public void getTeamInfo() {
        System.out.println("Команда: " + this.name );
        for (Participant participant : participants) {
            if (participant instanceof Mole) {
                System.out.println("Крот " + participant.getName());
            }
            if (participant instanceof Moose) {
                System.out.println("Лось " + participant.getName());
            }
            if (participant instanceof Ram) {
                System.out.println("Баран " + participant.getName());
            }
            if (participant instanceof Wolverine) {
                System.out.println("Росомаха " + participant.getName());
            }
        }
    }

    public void showResults(){
        for (Participant participant : participants) {
            if (!participant.isOnDistance()) {
                break;
            }
        }
    }
    public void doIt(Obstacle obstacle){
        for (Participant participant : participants) {
            obstacle.doIt(participant);
        }
    }

}
