package com.mycompany.main.java;

import com.mycompany.main.java.forunittest.CalculateMethods;

import java.util.*;

public class Main {

    public static final String CONSTRUCT = "dfgdfg";

    public static void main(String[] args) {

        //getProperties();

        System.out.println(56 + "Simplilearn");
        System.out.println("E-Learning Company" + 100 + 100);

        System.out.println(addValues("3","3.5", "101.2"));


        String str1 ="";

        int a = 4;
        Long l1 = new Long(a);
        long l2 = (long)a;

        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));

        int myval;
        System.out.println("myval: " + Byte.MAX_VALUE);
        long newL = a;
        System.out.println(newL);
        a = (int)newL;

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(16);
        System.out.println(list1);

        // Method 1 of going through the list
        for (int lst : list1) {
            System.out.println(lst);
        }

        // Method 2 of going through the list
        Iterator<Integer> itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Method 3 of going through the list
        list1.forEach(System.out::println);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Key1", 1);
        hashMap.put("Key2", 2);
        hashMap.put("Key3", 3);
        System.out.println(hashMap);


        // Method 1 of going through the hash map
        Set<String> keys = hashMap.keySet();
        System.out.println(keys);
        Iterator<String> itr2 = keys.iterator();
        while (itr2.hasNext()) {
            String item = itr2.next();
            System.out.println(item + " : " + hashMap.get(item));
        }

        // Method 2 of going through the hash map
        for (String key : keys) {
            System.out.println(key + " : " + hashMap.get(key));
        }

        String a1 = MyEnums.ENUM1.toString();
        MyEnums a2 = MyEnums.ENUM1;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1.equals(String.valueOf(a2)));

        //------------------------------------------------

        CalculateMethods calc = new CalculateMethods();
        System.out.println(calc.divide(1,4));
        System.out.println(1/4);


    }

    static void getProperties() {
        System.out.println("Hello World!");
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("line.separator"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("path.separator"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
    }

    static double addValues(String ... values) {
        double result = 0;
        for (String value : values) {
            result += Double.parseDouble(value);
        }
        return result;
    }
}
