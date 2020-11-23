package tasks.epam.arrayreader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.testng.Assert.*;

public class FileReaderTest {
    private List<Integer> array;
    private String fileName = "inputfiles/array.txt";

    @Test
    public void testArrayLoader() {
        String actual = "";
        String expected = "[12, 15, 300, 400, 873, 4531, 124, 54, 2, 4123, 43]";
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
        actual += array.toString();
        assertEquals(actual, expected);
    }
}