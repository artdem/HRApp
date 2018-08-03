package com.company;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class AppMenuNavigation {
    private static Scanner scanner = new Scanner(System.in);
    private static int mainMenuChoice = 0;
    private static int newEmployeeMenuChoice;
    private static int searchEmployeeMenuChoice;
    private static int allEmployeesMenuChoice;

    public static void appMenuNavigation() {
        AppMenu.mainMenu();
        while (mainMenuChoice != 5) {
            mainMenuChoice = scanner.nextInt();
            switch (mainMenuChoice) {
                case 1:
                    AppMenu.newEmployeeMenu();
                    newEmployeeMenuChoice = scanner.nextInt();
                    switch (newEmployeeMenuChoice) {
                        case 1:
                            Database.ALL_EMPLOYEES.add(President.addPresident());
                            System.out.println("Pracownik dodany");
                            AppMenu.mainMenu();
                            break;
                        case 2:
                            Database.ALL_EMPLOYEES.add(Manager.addManager());
                            System.out.println("Pracownik dodany\n");
                            AppMenu.mainMenu();
                            break;
                        case 3:
                            Database.ALL_EMPLOYEES.add(Accountant.addAccountant());
                            System.out.println("Pracownik dodany\n");
                            AppMenu.mainMenu();
                            break;
                        case 4:
                            Database.ALL_EMPLOYEES.add(Worker.addWorker());
                            System.out.println("Pracownik dodany.\n");
                            AppMenu.mainMenu();
                            break;
                        case 5:
                            AppMenu.mainMenu();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Usuwanie pracownika");
                    Removal.employeeRemoval();
                    break;
                case 3:
                    AppMenu.searchEmployeeMenu();
                    searchEmployeeMenuChoice = scanner.nextInt();
                    switch (searchEmployeeMenuChoice) {
                        case 1:
                            System.out.println("Szukanie po ID.");
                            break;
                        case 2:
                            System.out.println("Szukanie po imieniu.");
                            break;
                        case 3:
                            System.out.println("Szukanie po nazwisku.");
                            break;
                        case 4:
                            System.out.println("Szukanie po stanowisku.");
                            break;
                        case 5:
                            AppMenu.mainMenu();
                            break;
                    }
                    break;
                case 4:
                    AppMenu.allEmployeesMenu();
                    allEmployeesMenuChoice = scanner.nextInt();
                    switch (allEmployeesMenuChoice) {
                        case 1:
                            System.out.println("Wszyscy pracownicy:");
                            for (Employee i : Database.ALL_EMPLOYEES){
                                System.out.println(i);
                            }
                            break;
                        case 2:
                            System.out.println("Wszyscy prezesi:");
                            ViewingEmployees.viewPresidents();
                            AppMenu.mainMenu();
                            break;
                        case 3:
                            System.out.println("Wszyscy managerowie:");
                            ViewingEmployees.viewManager();
                            AppMenu.mainMenu();
                            break;
                        case 4:
                            System.out.println("Wszyscy księgowi: ");
                            ViewingEmployees.viewAccountant();
                            AppMenu.mainMenu();
                            break;
                        case 5:
                            System.out.println("Pozostali pracownicy:");
                            ViewingEmployees.viewWorker();
                            AppMenu.mainMenu();
                            break;
                        case 6:
                            AppMenu.mainMenu();
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Powinno wyjść z programu.");
            }
        }
    }
}
