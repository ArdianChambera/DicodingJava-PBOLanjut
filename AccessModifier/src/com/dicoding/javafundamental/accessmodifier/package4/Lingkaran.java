package com.dicoding.javafundamental.accessmodifier.package4;

public class Lingkaran {
    // contoh penggunaan final, seperti kode kondtanta nilai PI pada lingkaran
    static final double PI = 3.141;

    int jari = 7;

    final double getLuas() {
        return PI * (jari * jari);
    }
}
