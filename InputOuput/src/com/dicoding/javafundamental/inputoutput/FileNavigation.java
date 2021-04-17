package com.dicoding.javafundamental.inputoutput;

import java.io.File;

public class FileNavigation {
    public static void main(String[] args) {

        // Code akan membuat directories
//        String dirname = "E:/Google_Drive/Kuliah/Semester 6/Pemrograman Berorientasi Objek Lanjut 2021 Genap/DicodingJava/InputOuput/latihan1";
//        File file = new File(dirname);
//
//        // Buat directory
//        file.mkdirs();

        // Akan membaca file yang ada dalam Folder String dirname
        String dirname = "E:/Google_Drive/Kuliah/Semester 6/Pemrograman Berorientasi Objek Lanjut 2021 Genap/DicodingJava/InputOuput/latihan1";
        File file = null;
        String[] paths;
        try {
            // Instansiasi objek File
            file = new File(dirname);
            // Ambil list files dan masukkan ke string paths
            paths = file.list();
            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
