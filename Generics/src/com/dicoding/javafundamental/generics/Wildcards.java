package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<String> ls = new ArrayList();
        ls.add("String1");
        ls.add("String2");

//        print(ls); // Apakah baris ini valid?
        print(ls); // Baris ini Valid

        Collection<Planet> cp = new ArrayList();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("Venus", 0.82));

//        print(cp); // Apakah baris ini valid?
        print(cp); // Baris ini valid
    }

//    public static void print(Collection<Object> collection) {
//        for (Object o : collection) {
//            System.out.println(o);
//        }
//    }
public static void print(Collection<?> collection) { // perubahan ada di baris ini
    for (Object o : collection) {
        System.out.println(o);
    }
}
}
