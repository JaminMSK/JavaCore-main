package HomeWork_1;

/* Сделал Vladislav Torgashev
22.03.2022
 */

public interface Participant {

    String getName();

    boolean isOnDistance();

    void run(int distance);

    void jump(int height);

    void swim(int distance);
}
