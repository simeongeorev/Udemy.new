package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contacts> contactsList=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);

    public ArrayList<Contacts> getContactsList() {
        return contactsList;
    }

    public MobilePhone() {

    }

    public void addContactToList(Contacts newCon){
        if(contactsList.contains(newCon))
            System.out.println("Contact already exists.");
        else
            contactsList.add(newCon);
    }
    public void addContactToList(String name1, long number1){
        Contacts newC=Contacts.createContact(name1,number1);
        if(contactsList.contains(newC))
            System.out.println("Contact already exists.");
        else
            contactsList.add(newC);


}
    public void removeContact(Contacts newCon){
        contactsList.remove(newCon);
    }
    public void editContact(Contacts newCon){
        if(contactsList.contains(newCon)){
            System.out.println(newCon.getName());
            System.out.println(newCon.getNumber());

            newCon.setName(sc.next());
            newCon.setNumber(sc.nextLong());
        }
        else
            System.out.println("The contact doesn't exist.");
    }
    public Contacts findContact(String name){
        for(Contacts con : contactsList)
            if(name == con.getName())
                return con;
            return null;
    }
    public Contacts findContact(long number){
        for(Contacts con : contactsList)
            if(number == con.getNumber())
                return con;
        return null;
    }
    public void printContactList(){
        for(Contacts con : contactsList) {
            System.out.println(con.getName());
            System.out.println(con.getNumber());
            System.out.println();
        }
    }
//    public String[] allContactNames(){
//        String[]conNames=new String[contactsList.size()];
//        for (int i=0; i<conNames.length; i++){
//            conNames[i]=contactsList.get(i).getName();
//        }
//        return conNames;
//    }

}
