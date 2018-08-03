package com.company;

import java.util.Scanner;

public enum Branch {
    SZCZECIN, POZNAN, WARSZAWA;

    public static Branch branchSelection() {
        System.out.println("Wybierz oddział:");
        System.out.println("1. Szczecin");
        System.out.println("2. Poznań");
        System.out.println("3. Warszawa");
        System.out.println("4. Cofnij");
        Scanner scanner = new Scanner(System.in);
        int branchChoice = scanner.nextInt();
        Branch branchParameter = null;
        if (branchChoice <= 0 || branchChoice > 4) {
            System.out.println("Wybierz oddiał 1, 2 lub 3.");
            branchSelection();
        } else {
            switch (branchChoice) {
                case 1:
                    branchParameter = Branch.SZCZECIN;
                    break;
                case 2:
                    branchParameter = Branch.POZNAN;
                    break;
                case 3:
                    branchParameter = Branch.WARSZAWA;
                    break;
                case 4:
                    AppMenu.newEmployeeMenu();
            }
        }
        return branchParameter;
    }
}
