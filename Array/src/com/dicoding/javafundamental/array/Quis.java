package com.dicoding.javafundamental.array;

public class Quis {
    public static void main(String[] args) {

        // String dapat digabungkan dengan operator +=, yang berarti str = str + 23
        String str = "91204";
        str += 23;
        System.out.print(str);

        System.out.println("Batas");
        // x bernilai 5, yang berarti 5 lebih besar atau sama dengan 5
        int x = 5;
        if (x > 6) System.out.println("x>i");
        else if (x >= 5)
            System.out.println("x>=5");
        else if (x < 10)
            System.out.println("x<10");
        else
            System.out.println("bukan dari salah satu di atas");
    }
}
