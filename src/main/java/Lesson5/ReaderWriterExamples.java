package Lesson5;

import java.io.*;
import java.util.ArrayList;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderWriterExamples {
    public static void main(String[] args) {

        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("test2.txt"), UTF_8)) {
            int x;
            while ((x = inputStreamReader.read()) != -1){
                System.out.println(x);
                System.out.println((char) x);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test2.txt"))) {
            System.out.println(bufferedReader.readLine());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Student> students = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"))) {
            String tempString;

            while ((tempString = bufferedReader.readLine()) != null){
                String[] studentParams = tempString.split(" ");
                students.add(new Student(studentParams[0], studentParams[1], Integer.parseInt(studentParams[2])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(students);

        try(PrintWriter printWriter = new PrintWriter("new_students.csv")){
            for(Student student : students ){
               printWriter.println(student.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
