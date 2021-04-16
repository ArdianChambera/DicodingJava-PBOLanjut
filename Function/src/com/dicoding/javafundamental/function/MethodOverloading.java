package com.dicoding.javafundamental.function;

public class MethodOverloading {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p, l);
        System.out.println("Hasilnya adalah = " + hasil);
        int pn = 7;
        int lb = 6;
        int hsl = (int) hitungLuas(pn, lb); // di cast ke int, klo gak harus menggunakan double (doubel hsl .....)
        System.out.println("hasilnya adalah = " + hsl);
    }

    public static double hitungLuas (double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
}
