package Lesson4;

import java.util.*;

public class IteratorExamples {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        System.out.println(integerArrayList);

        for(Integer integer : integerArrayList){
            if(integer == 3){
                integerArrayList.remove(new Integer(3));
            }
        }
        System.out.println(integerArrayList);


        HashMap<String, Integer> integerHashMap = new HashMap<>();

        integerHashMap.put("test1", 4);
        integerHashMap.put("test12", 4);
        integerHashMap.put("test13", 4);

        Iterator<Map.Entry<String, Integer>> iterator = integerHashMap.entrySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next().getKey();
            System.out.println(key);
            if (key.equals("test12")){
                iterator.remove();
            }
        }

        System.out.println(integerHashMap);
    }
}
