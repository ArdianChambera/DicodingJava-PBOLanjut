package com.dicoding.javafundamental.array;

public class InisiasiArray {
    public static void main(String[] args) {

        // Cara 1
//        int[] arrInt = new  int[]{1,2,3,4,5,6};
//
//        System.out.println(arrInt[0]);
//        System.out.println(arrInt[1]);
//        System.out.println(arrInt[2]);
//        System.out.println(arrInt[3]);
//        System.out.println(arrInt[4]);
//        System.out.println(arrInt[5]);

        // Cara 2
        int[] arrInt = new int[6];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        arrInt[3] = 4;
        arrInt[4] = 5;
        arrInt[5] = 6;

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);

        System.out.println("Batas");
        int[] arrInt2 = new int[1000];

        // Inisiasi dan menampilkan arrInt dari elemen ke 1 sampai 1000
        for (int x = 0; x < arrInt2.length; x++) {
            arrInt2[x] = x + 1;
            System.out.println("Array ke : " + arrInt2[x]);
        }
    }
}
