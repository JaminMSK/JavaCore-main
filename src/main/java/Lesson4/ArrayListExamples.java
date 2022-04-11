package Lesson4;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(100);
        integerArrayList.add(123);
        integerArrayList.add(124);
        integerArrayList.add(125);
        integerArrayList.add(123);

        System.out.println(integerArrayList);

        integerArrayList.remove(new Integer(123));
        integerArrayList.remove(new Integer(123));
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.size());

        integerArrayList.set(1, 999);
        System.out.println(integerArrayList);

        integerArrayList.set(1, 777);
        System.out.println(integerArrayList);

        System.out.println(integerArrayList.contains(999));

        ArrayList<Integer> integerArrayList1 = new ArrayList<>(Arrays.asList(123, 567));
        integerArrayList.removeAll(integerArrayList1);
        System.out.println(integerArrayList);

        integerArrayList.addAll(integerArrayList1);
        System.out.println(integerArrayList);
    }

}
