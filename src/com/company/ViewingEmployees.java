package com.company;

public class ViewingEmployees {

    public static void viewPresidents(){
        for (Employee i : Database.ALL_EMPLOYEES){
            if (i.getPosition() == Positions.PRESIDENT){
                System.out.println(i);
            }
        }
    }

    public static void viewManager(){
        for (Employee i : Database.ALL_EMPLOYEES){
            if (i.getPosition() == Positions.MANAGER){
                System.out.println(i);
            }
        }
    }

    public static void viewAccountant(){
        for (Employee i : Database.ALL_EMPLOYEES){
            if (i.getPosition() == Positions.ACCOUNTANT){
                System.out.println(i);
            }
        }
    }

    public static void viewWorker(){
        for (Employee i : Database.ALL_EMPLOYEES){
            if (i.getPosition() == Positions.WORKER){
                System.out.println(i);
            }
        }
    }
}
