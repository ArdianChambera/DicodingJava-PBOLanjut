package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        // menggunakan ArrayList
        List<String> planet= new ArrayList<>();
        planet.add("mercury"); // method add() untuk menambahkan objek ke list
        planet.add("venus");
        planet.add("earth");
        planet.add("mars"); // masih bisa menambah objek ke list

        System.out.println("List planets awal : ");
        for (int i = 0; i < planet.size();i++) {
            System.out.println("\t index - "+ i +" = " + planet.get(i));
        }

        planet.remove("venus"); //method remove untuk mengeluarkan bjek dari list

        System.out.println("List planets skhir : ");
        for (int i = 0; i < planet.size(); i++) {
            System.out.println("\t index - " + i +" = " + planet.get(i));
        }
    }
}
