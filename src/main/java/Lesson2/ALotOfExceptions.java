package Lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ALotOfExceptions {
    public static void main(String[] args) {
        InputStream InputStream;

        try {
            String[] strings = {"ssfefef", "dssdsd"};
            int a = 1/0;

            String strings1 = strings[2];
            test();

            InputStream = new FileInputStream("sdsd");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("массив");
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("fsfv");
    }

    public static void test() {
        test();

    }
}
