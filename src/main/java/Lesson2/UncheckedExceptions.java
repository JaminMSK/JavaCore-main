package Lesson2;

public class UncheckedExceptions {
    public static void main(String[] args){
        int a = 1;
        int b = 0;

        if(b != 0){
            int c = a / b;
        }

        System.out.println("Я жива!!!");

        String[] array = {"ssfefef", "dssdsd"};

        if (array.length >= 3) {
            String string = array[0];
            System.out.println(string);
        }

        System.out.println("Я жива!!!");

    }
}
