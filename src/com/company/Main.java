package com.company;

public class Main {

    public static void main(String[] args) {

        HashMap map = new HashMap(5);
        //map.put(new Key(), new Value());
        map.put(2, 222);
        map.put(3, 30);
        map.put(4, 401);
        map.put(5, 557);
        map.put(6, 6);
        //map.put(7, 7);
        System.out.println("-------------------");
        map.searchByKey(5);
        System.out.println("-------------------");
        map.get(3);
        map.toString();
//        int y = 0;
//        int k = 3;
//        do {
//            k = k * 2;
//            y = y + k;
//        }
//        while (k < 7);
//        System.out.println("y = " + y);
//        System.out.println("k = " + k);


    }
}
