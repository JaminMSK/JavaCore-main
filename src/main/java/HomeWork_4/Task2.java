package HomeWork_4;

import java.util.ArrayList;

/* Сделал Vladislav Torgashev
04.04.2022
 */

public class Task2 {
    public static void main(String[] args) {
        ArrayList<PhoneBook> phoneBooks = new ArrayList<>();
        phoneBooks.add(new PhoneBook("Плющенко", "+74993456543"));
        phoneBooks.add(new PhoneBook("Сапелюк", "+79996574345"));
        phoneBooks.add(new PhoneBook("Бадуков", "+79994569076"));
        phoneBooks.add(new PhoneBook("Сапелюк", "+74958763498"));
        phoneBooks.add(new PhoneBook("Клинов", "+79090963456"));
        phoneBooks.add(new PhoneBook("Плющенко", "+74956667744"));

        System.out.println("Исходный массив с телефонными номерами:" + phoneBooks.toArray().length);

        for(int i = 0; i < phoneBooks.toArray().length; i++)
            System.out.println(phoneBooks.get(i));

        System.out.println("\nСписок совпадений для фамилии \"Плющенко\": ");
        PhoneBook.getPhone("Плющенко", phoneBooks);

        System.out.println("\nСписок совпадений для фамилии \"Сапелюк\": ");
        PhoneBook.getPhone("Сапелюк", phoneBooks);
    }
}
