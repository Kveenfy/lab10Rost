package lab10;

import java.io.*;
import java.text.MessageFormat;
import java.util.*;

public class task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("lab10/task2.txt"));
        String t = "", s = "", searchTown = in.readLine();
        while ((t = in.readLine()) != null) s += t + '\n';
        in.close();
        TreeMap<String, Integer> a = new TreeMap<>();
        for (int i = 0; i < s.split("\n").length; i++) {
            a.put(s.split("\n")[i].split(" ")[1], Integer.parseInt(s.split("\n")[i].split(" ")[0]));
        }
        String min = a.firstKey();
        for (Map.Entry<String, Integer> element : a.entrySet()) {
            System.out.println(MessageFormat.format("\nПункт назначения: {0}\nДлина маршрута: {1}км", element.getKey(), element.getValue()));
            if (element.getValue() < a.get(min))
                min = element.getKey();
        }

        System.out.println(MessageFormat.format("\nСамый близкий город: {0}, длина маршрута: {1}км", min, a.get(min)));
        System.out.println(MessageFormat.format("Длина маршрута до {0}: {1}км", searchTown, a.get(searchTown)));

    }   
}