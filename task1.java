package lab10;

import java.io.*;

public class task1 {
    public static void main(String[] args) {
        File dir = new File("E:/Python Java");
        System.out.println(dir.getName() + " - каталог");
        showInfo(dir);
    }

    static void showInfo(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile())
                System.out.println("\t" + file.getName() + " - файл");
            else {
                System.out.println(file.getName() + " - подкаталог");
                showInfo(file);
            }
        }
    }
}
