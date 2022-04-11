package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {

        HashMap<Integer, String> passports = new HashMap<>();
        passports.put(1234, "Ирина");
        passports.put(2344, "Андрей");
        passports.put(11234, "Антон");
        passports.put(12134, "Оксана");

        System.out.println(passports);

        passports.remove(11234);
        System.out.println(passports);

        System.out.println(passports.get(2344));

        //HashMap<String, ArrayList<String>> arrayListHashMap = new HashMap<>();


        for(Integer key : passports.keySet()){
            if(key == 1234){
                passports.remove(key);
            }
        }
        System.out.println(passports);
    }
}
