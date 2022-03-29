package Lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckedExceptions {
    public static void main(String[] args) {

        try {
            InputStream InputStream = new FileInputStream("sdsd");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Я жива!!!");
    }
}
