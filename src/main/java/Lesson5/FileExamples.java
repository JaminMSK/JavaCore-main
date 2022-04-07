package Lesson5;

import java.io.File;
import java.io.IOException;

public class FileExamples {
    public static void main(String[] args) throws IOException {
        File file = new File("scrin.png");
        System.out.println(file.exists());

        File file2 = new File("2.txt");
        file2.createNewFile();
        System.out.println(file2.exists());
        System.out.println(file2.length());
        System.out.println(file.length());

        file2.delete();

        File filePath = new File("1z1");
        filePath.mkdir();

        File filePath2 = new File("1z2/123/321/1");
        filePath2.mkdirs();

        System.out.println(filePath2.length());

        File currentFolder = new File(".");
        for(File temp : currentFolder.listFiles()){
            System.out.println(temp.getName());
        }
    }
}
