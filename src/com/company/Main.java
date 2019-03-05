package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Contacts> newList=new ArrayList<>();
        MobilePhone Lenovo = new MobilePhone();
        Contacts Ivan = new Contacts("Ivan", 896776675);
        Contacts Ivancho = new Contacts("Ivancho", 896435667);
//        Contacts Ivankata = new Contacts("Ivankata", 89123766);
//        Contacts Mitko = new Contacts("Mitko", 894234766);
//        Contacts Marti = new Contacts("Marti", 896867675);
        Lenovo.printContactList();
        Lenovo.addContactToList(Ivan);
        Lenovo.addContactToList(Ivancho);
        Lenovo.addContactToList("Ceci", 777666);
        Lenovo.addContactToList("Ceci", 777666);
        Lenovo.printContactList();
    }


}
 // ENDING CLASS BRACKETS

/*
        while(flag) {
            flag=false;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i]>array[i+1]){
                    holder=array[i];
                    array[i]=array[i+1];
                    array[i+1]=holder;
                    flag=true;
                }
            }
        }
        */