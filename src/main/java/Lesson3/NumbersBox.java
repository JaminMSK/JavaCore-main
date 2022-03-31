package Lesson3;

public class NumbersBox<T extends Number> {
    private T[] array;

    public NumbersBox(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public double calcAverage(){
        double sum = 0.0;

        for(T num : array){
            sum = sum + num.doubleValue();

        }
        return sum / array.length;
    }

    public boolean isSmeAverage(NumbersBox<?> boxToCompare){
        return Math.abs(calcAverage() - boxToCompare.calcAverage()) < 0.0001;
    }

    public static <U extends Number> U getFirstElement(NumbersBox<U> numbersBox){
        return numbersBox.getArray()[0];
    }




    public static void main(String[] args) {
        NumbersBox<Integer> integerNumbersBox = new NumbersBox<>(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(integerNumbersBox.calcAverage());

        NumbersBox<Integer> integerNumbersBox2 = new NumbersBox<>(1, 2, 3, 4, 5, 6, 7, 8);

        NumbersBox<Double> doubleNumbersBox1 = new NumbersBox<>(1.0, 4.0, 2.6, 3.4);

        System.out.println(doubleNumbersBox1.isSmeAverage(integerNumbersBox2));
        System.out.println(integerNumbersBox2.isSmeAverage(integerNumbersBox));

        System.out.println(getFirstElement(doubleNumbersBox1));
        System.out.println(getFirstElement(integerNumbersBox2));
    }
}

