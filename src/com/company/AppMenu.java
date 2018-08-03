package com.company;

import java.util.Scanner;

public class AppMenu {

    public static void mainMenu(){
        System.out.println("MENU GŁÓWNE:");
        System.out.println("1: Nowy pracownik");
        System.out.println("2: Usuń");
        System.out.println("3: Wyszukaj");
        System.out.println("4: Wyświetl pracowników");
        System.out.println("5: WYJŚCIE");
    }

    public static void newEmployeeMenu(){
        System.out.println("Wybierz stanowisko:");
        System.out.println("1. Prezes");
        System.out.println("2. Manager");
        System.out.println("3. Księgowa");
        System.out.println("4. Pracownik");
        System.out.println("5. COFNIJ");
    }

    public static void searchEmployeeMenu(){
        System.out.println("Kryteria wyszukiwania:");
        System.out.println("1. ID");
        System.out.println("2. Imię");
        System.out.println("3. Nazwisko");
        System.out.println("4. Stanowisko");
        System.out.println("5. COFNIJ");
    }

    public static void allEmployeesMenu(){
        System.out.println("Wyświetlanie pracowników:");
        System.out.println("1. Wyświetl wszystkich pracowników");
        System.out.println("2. Wyświetl Prezesów");
        System.out.println("3. Wyświetl Managerów");
        System.out.println("4. Wyświetl Księgowych");
        System.out.println("5. Wyświetl pozostałych Pracowników");
        System.out.println("6. COFNIJ");
    }


}
