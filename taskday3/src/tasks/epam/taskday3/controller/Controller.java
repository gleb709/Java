package tasks.epam.taskday3.controller;

import tasks.epam.taskday3.medCard.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private String diagnose;
    private List<MedCard> dataBase = new ArrayList<>();

    public void searchPersonDiagnosis(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диагноз");
        diagnose = scanner.nextLine();
        for (int i = 0; i < dataBase.size(); i++){
            if(dataBase.get(i).getPersonDiagnosis().equals(diagnose)) {
                System.out.println(dataBase.get(i).toString());
            }
        }
    }

    public void searchPersonMedCardNumber(){
        Scanner scanner = new Scanner(System.in);
        int medCardMAX;
        int medCardMIN;
        System.out.println("Введите диапазон мед.карт");
        while(true){
            try {
                System.out.println("Нижний предел");
                medCardMIN = scanner.nextInt();
                System.out.println("Верхний предел");
                medCardMAX = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ошибка. Повторите попытку");
                scanner.nextLine();
                continue;
            }
            break;
        }
        for (MedCard med : dataBase) {
            if(med.getPersonMedCardNumber() >= medCardMIN && med.getPersonMedCardNumber() <= medCardMAX) {
                System.out.println(med.toString());
            }
        }
    }

    public void addPerson(){
        MedCard medCard = new MedCard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пациента");
        medCard.setPersonName(scanner.nextLine());
        System.out.println("Введите фамилию пациента");
        medCard.setPersonSurname(scanner.nextLine());
        System.out.println("Введите адрес пациента");
        medCard.setPersonAddress(scanner.nextLine());
        System.out.println("Введите номер телефона пациента");
        while(true){
            try {
                medCard.setPersonPhoneNumber(scanner.nextLong());
            } catch (Exception e) {
                System.out.println("Ошибка. Повторите попытку");
                scanner.nextLine();
                continue;
            }
            break;
        }
        scanner.nextLine();
        System.out.println("Поставить диагноз пациенту");
        medCard.setPersonDiagnosis(scanner.nextLine());
        medCard.setPersonID(dataBase.size() + 1);
        medCard.setPersonMedCardNumber(10000 + dataBase.size());
        dataBase.add(medCard);
        System.out.println("Больной зарегистрирован");
    }
}
