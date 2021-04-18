package com.dicoding.javafundamental;

public class casting {
    public static void main(String[] args) {
        int a = (int) 3.14;
        System.out.println("Nilai a setelah di casting = " + a);

        System.out.println("");

        double b = 5.14;
        String hasil = String.valueOf(b);
        System.out.println("Nilai b setelah di casting = " + hasil);
        // Perlu diingat bahwa hasil dari output tersebut bukanlah lagi double melainkan sudah menjadi String.
    }
}
