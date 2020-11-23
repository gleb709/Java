package tasks.epam.searchalgorithms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FibonacciNumbersTest {
    private int[] array;

    @BeforeMethod
    public void setInfo(){
        array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 13;
    }

    @Test
    public void testStartSearchFibonacciNumbers() {
        int counter = 0;
        int previousNumber;
        int presentNumber;
        int bufferNumber;
        String fibonacciNumbers = "Числа Фибоначчи в массиве: ";
        for (int number : array) {
            presentNumber = 1;
            previousNumber = 1;
            while(true){
                if (number == presentNumber) {
                    fibonacciNumbers += "ID: " + counter + " Число: " + number + " ";
                    break;
                }else if(presentNumber > number){
                    break;
                }
                bufferNumber = presentNumber;
                presentNumber = presentNumber + previousNumber;
                previousNumber = bufferNumber;

            }
            counter++;
        }
        System.out.println(fibonacciNumbers);
    }

    @AfterMethod
    public void delInfo(){
        array = null;
    }
}