
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Menampilkan output cetak nama
 */
public class CetakNama {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Printer print = new Printer();
        
        System.out.println("_________Aplikasi Pencetak Nama_________");
        System.out.print("Masukkan nama anda : ");
        print.setNama(scn.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        print.setJmlCetak(scn.nextInt());
        
        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
    }
}
