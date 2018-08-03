package com.company;

import java.util.UUID;

public class Employee {
    private Positions position;
    private String name;
    private String surname;
    private String address;
    private Branch branch;
    private UUID uuid;

    public Employee (){

    }

    public Employee(Positions positionParameter, String nameParameter, String surnameParameter, String addressParamater, Branch branchParameter, UUID uuidParameter){
        this.position = positionParameter;
        this.name = nameParameter;
        this.surname = surnameParameter;
        this.address = addressParamater;
        this.branch = branchParameter;
        this.uuid = uuidParameter;
    }

    public Positions getPosition() {
        return position;
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public String toString(){
        return "Imię i nazwisko pracownika: " + name + " " + surname + ".\n" + "Adres pracownika: " + address + ".\n" + "Stanowisko pracownika: " + position + ".\n" + "Oddział: " + branch + ".\n" + "Numer ID: " + uuid + ".\n";
    }
}
