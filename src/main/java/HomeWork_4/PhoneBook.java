package HomeWork_4;

/* Сделал Vladislav Torgashev
04.04.2022
 */

import java.util.ArrayList;

public class PhoneBook {
    private String surname;
    private String phoneNimber;


    public PhoneBook(String surname, String phoneNimber){
        this.surname = surname;
        this.phoneNimber = phoneNimber;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNimber() {
        return phoneNimber;
    }

    public String getObject() {
        return this.getSurname() + "\t" +  this.getPhoneNimber();
    }

    @Override
    public String toString() {
        return "UniqueElement{" +
                "surname='" + surname + '\'' +
                ", phoneNimber='" + phoneNimber + '\'' +
                '}';
    }

    public static void getPhone(String strToSearch, ArrayList<PhoneBook> phoneBooks) {
        for (int i = 0; i < phoneBooks.toArray().length; i++)
            if (strToSearch == phoneBooks.get(i).getSurname())
                System.out.println(phoneBooks.get(i));
        return;
    }
}
