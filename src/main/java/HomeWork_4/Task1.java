package HomeWork_4;

import java.util.*;

/* Сделал Vladislav Torgashev
04.04.2022
 */

public class Task1 {
    public static void main(String[] args) {
        List<String> kaupungi = Arrays.asList("Riihimäki", "Helsinki", "Lahti", "Oulu", "Turku", "Tampere",
                "Vaasa", "Pori", "Tampere", "Moskov", "Pietari", "Rovaniemi", "Levi", "Pasila");
        System.out.println("Исходный список:");
        kaupungi.forEach(System.out::println);

        System.out.println("\nСводка:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : kaupungi) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);

        System.out.println("\nБез повторов: ");
        Set<String> unique = new HashSet<>(kaupungi);
        unique.forEach(System.out::println);

    }
}
