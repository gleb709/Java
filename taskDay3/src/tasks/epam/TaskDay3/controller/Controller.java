package tasks.epam.TaskDay3.controller;

import tasks.epam.TaskDay3.medCard.MedCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller {
    private String diagnose;
    private ArrayList<MedCard> dataBase = new ArrayList<>();

    public void searchPersonDiagnosis(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите диагноз");
        diagnose = scanner1.nextLine();
        for (int i = 0; i < dataBase.size(); i++){
            if(dataBase.get(i).getPersonDiagnosis().equals(diagnose)) {
                System.out.println(dataBase.get(i).toString());
            }
        }
    }

    public void searchPersonMedCardNumber(){
        Scanner scanner1 = new Scanner(System.in);
        int medCardMAX;
        int medCardMIN;
        System.out.println("Введите диапазон мед.карт");
        while(true){
            try {
                System.out.println("Нижний предел");
                medCardMIN = scanner1.nextInt();
                System.out.println("Верхний предел");
                medCardMAX = scanner1.nextInt();
            } catch (Exception e) {
                System.out.println("Ошибка. Повторите попытку");
                scanner1.nextLine();
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
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите имя пациента");
        medCard.setPersonName(scanner1.nextLine());
        System.out.println("Введите фамилию пациента");
        medCard.setPersonSurname(scanner1.nextLine());
        System.out.println("Введите адрес пациента");
        medCard.setPersonAddress(scanner1.nextLine());
        System.out.println("Введите номер телефона пациента");
        while(true){
            try {
                medCard.setPersonPhoneNumber(scanner1.nextInt());
            } catch (Exception e) {
                System.out.println("Ошибка. Повторите попытку");
                scanner1.nextLine();
                continue;
            }
            break;
        }
        scanner1.nextLine();
        System.out.println("Поставить диагноз пациенту");
        medCard.setPersonDiagnosis(scanner1.nextLine());
        medCard.setPersonID(dataBase.size() + 1);
        medCard.setPersonMedCardNumber(10000 + dataBase.size());
        dataBase.add(medCard);
        System.out.println("Больной зарегистрирован");
    }
}
