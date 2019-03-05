package com.company;

import java.util.ArrayList;

public class Contacts extends MobilePhone{
    private String name;
    private long number;

    public Contacts(){};

    public static Contacts createContact(String name, long number){
        return new Contacts(name,number);
    }

    public Contacts(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public  String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }
}
