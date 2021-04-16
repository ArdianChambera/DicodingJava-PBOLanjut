package com.dicoding.javafundamental.inheritance;

public class Kucing extends Hewan {
    public Kucing() {
        super(); // Akan tetap memanggil constructor dari perent class
        System.out.println("Construct Kucing");
    }
}
