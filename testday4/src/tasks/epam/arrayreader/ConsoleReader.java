package tasks.epam.arrayreader;

import org.w3c.dom.ls.LSOutput;
import tasks.epam.entities.Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader {
    private List<Integer> array;
    private int[] newArray;

    public static void main(String[] args) {
        Array array = new Array();
        RandomArrayReader randomArrayReader = new RandomArrayReader();
        array.setArray(randomArrayReader.arrayLoader());
        System.out.println(array.toString());
    }

    public int[] arrayLoader(){
        Scanner scanner = new Scanner(System.in);
        array = new ArrayList<>();
        int counter = 0;
        while(true){
            try {
                array.add(scanner.nextInt());
            }catch (Exception e){
                if(scanner.nextLine().equals("done")) {
                    break;
                }else {
                    System.out.println("Ошибка ввода");
                }
            }
        }
        newArray = new int[array.size()];
        for (Integer i: array) {
            newArray[counter++] = i;
        }
        return newArray;
    }
}
