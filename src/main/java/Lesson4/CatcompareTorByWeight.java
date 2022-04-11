package Lesson4;

import java.util.Comparator;

public class CatcompareTorByWeight implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
