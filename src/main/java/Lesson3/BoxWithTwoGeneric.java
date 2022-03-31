package Lesson3;

public class BoxWithTwoGeneric<T, S> {
    private T obj;
    private S obj2;

    public BoxWithTwoGeneric(T obj, S obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public S getObj2() {
        return obj2;
    }

    public void setObj2(S obj2) {
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "BoxWithTwoGeneric{" +
                "obj=" + obj +
                ", obj2=" + obj2 +
                '}';
    }

    public static void main(String[] args) {
        BoxWithTwoGeneric<Integer, String> integerStringBoxWithTwoGenerics =
                new BoxWithTwoGeneric<>(1450000000, "Население чего то");

        System.out.println(integerStringBoxWithTwoGenerics.getObj2() + " " + integerStringBoxWithTwoGenerics.getObj());
    }
}
