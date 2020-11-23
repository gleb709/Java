package tasks.epam.searchalgorithms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BinarySearchTest {
    private int[] array;

    @BeforeMethod
    public void setInfo(){
        array = new int[7];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
    }

    @Test
    public void testStartBinarySearch() {
        int element = 0;
        int firstElement = 0;
        int lastElement = array.length-1;
        int elementToFind = 7;
        while(true){
            element =(firstElement + lastElement)/2;
            if(array[element] == elementToFind){
                System.out.println("Номер числа в массиве: " + element);
                break;
            }else if(firstElement >= lastElement){
                System.out.println("Такого числа в массиве нет");
                break;
            }
            if(elementToFind < array[element]){
                lastElement = element-1;
            }else{
                firstElement = element+1;
            }
        }
    }

    @AfterMethod
    public void delInfo(){
        array = null;
    }
}