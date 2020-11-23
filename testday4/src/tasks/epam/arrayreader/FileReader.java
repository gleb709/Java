package tasks.epam.arrayreader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private String fileName = "inputfiles/array.txt";
    private List<Integer> array;

    public List<Integer> arrayLoader() {
        array = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(new FileInputStream(fileName));
            while(scanner.hasNextInt()){
                array.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return array;
    }
}
