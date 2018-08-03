package com.company;

import java.util.Scanner;
import java.util.UUID;

public class Removal {

    public static void employeeRemoval(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID pracownika do usunięcia:");
        String idRemoval = scanner.nextLine();
        for (Employee i : Database.ALL_EMPLOYEES)
            if (i.getUuid().equals(idRemoval)){
                Database.ALL_EMPLOYEES.remove(i);
                System.out.println(i + " - Pracownik usunięty.");
                AppMenu.mainMenu();
            } else {
                System.out.println("Pracownik o podanym ID nie istnieje.");
                AppMenu.mainMenu();
            }
    }
}
