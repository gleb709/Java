package tasks.epam.TaskDay3.menu;

import tasks.epam.TaskDay3.controller.Controller;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        while (true) {
            int key;
            System.out.println("         Меню");
            System.out.println("1.Добавить больного");
            System.out.println("2.Сортировка больных по болезням");
            System.out.println("3.Сортировка больных по мед.картам");
            System.out.println("4.Выход");
            try {
                key = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Повторите попытку");
                scanner.nextLine();
                continue;
            }
            switch (key) {
                case 1: {
                    controller.addPerson();
                    break;
                }
                case 2: {
                    controller.searchPersonDiagnosis();
                    break;
                }
                case 3: {
                    controller.searchPersonMedCardNumber();
                    break;
                }
                case 4:
                    return;
                default: {
                    System.out.println("Ошибка ввода. Повторите попытку");
                    break;
                }
            }
        }
    }
}
