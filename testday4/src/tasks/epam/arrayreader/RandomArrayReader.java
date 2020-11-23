package tasks.epam.arrayreader;

import java.util.Random;

public class RandomArrayReader {
    public int[] arrayLoader(){
        int arraySize = (int)(8 + Math.random()*40);
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            array[i] = (int)(Math.random()*5000);
        }
        return array;
    }
}
