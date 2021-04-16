package com.dicoding.javafundamental.percabangan;

public class IfThenElseIfThenElse {
    public static void main(String[] args) {
        int nilaiUjian = 81;
        char indexPrestasi;

        if (nilaiUjian >= 90) {
            indexPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indexPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indexPrestasi = 'C';
        } else if (nilaiUjian >= 60) {
            indexPrestasi = 'D';
        } else if (nilaiUjian >= 50) {
            indexPrestasi = 'E';
        } else {
            indexPrestasi = 'F';
        }
        System.out.println("Nilai Ujian akhir anda adalah " + indexPrestasi);
    }
}
