package com.company;

import java.util.Scanner;

public class HashMap {

    private Object[] content;
    HashMap(int size){
        content = new Object[size];
    }

    public void put(Object key, Object value) {
        System.out.println(String.format("%s:%s %s:%d", "Key value", key, "value", key.hashCode() ));
        int index = key.hashCode() % content.length;
        //System.out.println(index);
        content[index] = value;
    }

    public void get(Object key){
        int index = key.hashCode() % content.length;
        System.out.println("For by Key: " + key + " Value: " + content[index]);
    }

    public void searchByKey (Object key){
        Object tempkey = 5;
        if (tempkey.equals(key)) {
            int index = key.hashCode() % content.length;
            System.out.println("Search by Key: " + key + " Value: " + content[index]);
            //System.out.println(content[index]);
        }
    }

//    Scanner scanner = new Scanner(System.in);
//    public void enterContent(){
//        for (int i=0; i<5; i++){
//            //int index = key.hashCode() % content.length;
//            Object value = scanner.nextLine();
//            System.out.println(value);
//        }
//    }

//    public void showContent(Object key, Object value){
//        int index = key.hashCode() % content.length;
//    }

}
