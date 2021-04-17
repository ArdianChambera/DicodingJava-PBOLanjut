package com.dicoding.javafundamental.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {
        // menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); // method add untuk menambah objek ke set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menabah obajek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars");

        // method size() untuk mendapatkan ukuran set
        System.out.println("Set planets awal : (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("venus"); //method remove() untk mengeluarkan objek dari set

        System.out.println("Set plants akhir : (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        }

    }
}
