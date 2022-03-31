package HomeWork_3;

/* Сделал Vladislav Torgashev
31.03.2022
 */

public abstract class Fruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
