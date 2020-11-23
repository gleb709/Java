package tasks.epam.searchalgorithms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchThreeDigitNumbersTest {
    private int[] array;

    @BeforeMethod
    public void setInfo(){
        array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 440;
        array[4] = 5;
        array[5] = 6;
        array[6] = 706;
        array[7] = 8;
        array[8] = 901;
        array[9] = 130;
    }

    @Test
    public void testStartSearchThreeDigitNumbers() {
        String actual = "";
        String expected = "Искомые числа: 706 901 130";
        String threeDigitNumbers = "Искомые числа: ";
        for (int i: array) {
            if( i > 123 && i < 987){
                if(i/100 != i % 10 && i/100 != i/10%10 && i %10 != i/10%10){
                    threeDigitNumbers += i + " ";
                }
            }
        }
        actual += threeDigitNumbers;
        assertEquals(actual,expected);
    }

    @AfterMethod
    public void delInfo(){
        array = null;
    }
}