/*
 AUTHOR : FAKHRI DJAMARIS
 PROJEK : CLASS, OBJECT, DAN METHOD
 DATE   : 11 MARET 2023
*/
package tugasmaya1;
import java.util.Scanner;


public class Manusia {

    private String nama;
    private int umur;

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
       
    }
    
    public void Nama(String nama) {
        this.nama = nama;
    }
    
    public void Umur(int umur) {
        this.umur = umur;
    }
    
    public void perkenalan() {
        System.out.println("Halo " + nama + ", umur anda adalah " + umur + " tahun.");
    }
    
   
    public static Manusia buatObjek() {
        Scanner fakhri = new Scanner(System.in);
        System.out.println("Selamat Datang di program pengisian Biodata!!");
        System.out.println("=============================================");
        System.out.print("Masukkan nama             : ");
        String nama = fakhri.nextLine();
        System.out.print("Masukkan umur             : ");
        int umur = fakhri.nextInt();
        fakhri.nextLine(); // membaca newline character setelah membaca bilangan bulat
        return new Manusia(nama, umur);
    }
}

