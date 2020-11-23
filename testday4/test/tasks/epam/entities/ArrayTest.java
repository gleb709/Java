package tasks.epam.entities;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class ArrayTest {
    private int arraySize;
    private int[] array;

    @BeforeMethod
    public void setInfo(){
        array = new int[3];
        array[0] = 15;
        array[1] = 20;
        array[2] = 30;
        arraySize = array.length;
    }

    @Test
    public void testRemove() {
        String arrayExpected = "[15, 30, ]";
        String arrayActual = "[";
        int elementId = 1;
        int newArrayCount = 0;
        int arrayCount = 0;
        if(elementId < arraySize){
            int newArray[] = new int[--arraySize];
            for(int i: array) {
                if(arrayCount != elementId) {
                    newArray[newArrayCount] = i;
                    arrayActual += newArray[newArrayCount++] + ", ";
                    arrayCount++;
                }else{
                    arrayCount++;
                }
            }
            arrayActual += "]";
            array = newArray;
            newArray = null;
            assertEquals(arrayActual,arrayExpected);
        }else{
            System.out.println("Введено некорректное число");
        }
    }

    @Test
    public void testAdd() {
        String arrayExpected = "[15, 20, 30, 0]";
        String arrayActual = "[";
        int newArray[] = new int[++arraySize];
        for(int i = 0; i < arraySize-1; i++) {
            newArray[i] = array[i];
            arrayActual += newArray[i] + ", ";
        }
        newArray[arraySize-1] = 0;
        array = newArray;
        arrayActual += newArray[arraySize-1] + "]";
        newArray = null;
        assertEquals(arrayActual,arrayExpected);
    }

    @Test
    public void testToString() {
        String arrayStringActual = new String();
        String arrayStringExpected = "[15, 20, 30]";
        arrayStringActual += "[";
        for (int i = 0; i < arraySize-1; i++ ){
            arrayStringActual += array[i] + ", ";
        }
        arrayStringActual += array[arraySize-1] + "]";
        assertEquals(arrayStringActual,arrayStringExpected);
    }

    @AfterMethod
    public void delInfo(){
        array = null;
    }
}