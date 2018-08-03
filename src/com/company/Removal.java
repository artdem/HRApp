package com.company;

import java.util.Scanner;
import java.util.UUID;

public class Removal {

    public static void employeeRemoval() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID pracownika do usunięcia:");
        String idRemoval = scanner.nextLine();
        for (int i = 0; i < Database.ALL_EMPLOYEES.size(); i++) {
            if (Database.ALL_EMPLOYEES.get(i).getUuid().toString().equals(idRemoval)) {
                System.out.println(Database.ALL_EMPLOYEES.get(i) + " - Pracownik usunięty.");
                Database.ALL_EMPLOYEES.remove(i);
            }
        }
    }
}
