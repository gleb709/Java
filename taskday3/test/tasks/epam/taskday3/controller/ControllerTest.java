package tasks.epam.taskday3.controller;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tasks.epam.taskday3.medCard.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ControllerTest {
    private List<MedCard> testDataBase = new ArrayList<>();

    @BeforeClass
    public void setTestDataBaseInfo(){
        MedCard medCard = new MedCard(1, "Фидель", "Кастро", "Куба", 1234321, 10001, "Неизвестно");
        testDataBase.add(medCard);
    }

    @Test
    public void testSearchPersonDiagnosis() {
        List<MedCard> expected = new ArrayList<>();
        List<MedCard> actual = new ArrayList<>();
        expected.add(testDataBase.get(0));
        String diagnose = "Неизвестно";
        for (int i = 0; i < testDataBase.size(); i++){
            if(testDataBase.get(i).getPersonDiagnosis().equals(diagnose)) {
                actual.add(testDataBase.get(i));
            }
        }
        assertEquals(actual, expected);
    }

    @Test
    public void testSearchPersonMedCardNumber() {
        List<MedCard> expected = new ArrayList<>();
        List<MedCard> actual = new ArrayList<>();
        expected.add(testDataBase.get(0));
        int testMedCardNumber = 10000;
        for (int i = 0; i < testDataBase.size(); i++){
            if(testDataBase.get(i).getPersonDiagnosis().equals(testMedCardNumber)) {
                actual.add(testDataBase.get(i));
            }
        }
        assertNotEquals(actual, expected);
    }

    @Test
    public void testAddPerson() {
        List<MedCard> expected = testDataBase;
        List<MedCard> actual = new ArrayList<>();
        MedCard medCard = new MedCard(1, "Фидель", "Кастро", "Куба", 1234321, 10001, "Неизвестно");
        actual.add(medCard);
        assertEquals(actual,expected);
    }

    @AfterClass
    public void removeTestDataBaseInfo(){
        testDataBase.clear();
        testDataBase = null;
    }
}