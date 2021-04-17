package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        // Contoh Eror
//        String location = "D://namafile.txt";
//        File file = new File(location);
//        FileReader fr = new FileReader(file);

        try {
            // Mencoba membaca berkas latihan.txt
            File file = new File ("E://Google_Drive//Kuliah//Semester 6//Pemrograman Berorientasi Objek Lanjut 2021 Genap//DicodingJava//Exception//latihanBacaFile.txt");
            FileReader fr = new FileReader(file);
            // Jika berhasil maka akan tampil pesan
            System.out.println("Read File berhasil");
        } catch (Exception e) {
            // Jika terjadi kesalahan maka akan tampilkan pesan
            System.out.println(e.getMessage());
        }

        // Multiple catch
//        try {
//
//        } catch (ExceptionType name) {
//
//        } catch (ExceptionType name) {
//
//        }

//        catch (IOException|SQLException ex) {
//            logger.log(ex);
//            throw ex;
//        }
    }
}
