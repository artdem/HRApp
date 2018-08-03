package com.company;

import java.util.Scanner;
import java.util.UUID;

public class Worker extends Employee {

    public static Employee addWorker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String nameParameter = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surnameParameter = scanner.nextLine();
        System.out.println("Podaj adres: ");
        String addressParameter = scanner.nextLine();
        Branch branchParameter = Branch.branchSelection();
        UUID uuidParameter = UUID.randomUUID();
        return new Employee(Positions.WORKER, nameParameter, surnameParameter, addressParameter, branchParameter, uuidParameter);
    }


}
