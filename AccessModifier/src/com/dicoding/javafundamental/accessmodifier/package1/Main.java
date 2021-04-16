package com.dicoding.javafundamental.accessmodifier.package1;

public class Main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();

        // Tidak bisa di akses karena dalam keadaan private
//        System.out.println(kelasA.memberA);
//        System.out.println(kelasA.functionA());

        System.out.println(kelasA.functionB());

        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);
    }
}
