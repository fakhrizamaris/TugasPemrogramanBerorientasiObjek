/*
 AUTHOR : FAKHRI DJAMARIS
 PROJEK : CLASS, OBJECT, DAN METHOD
 DATE   : 11 MARET 2023
*/
package tugasmaya1;
import java.util.Scanner;

public class Universitas {
    private String jurusan, namaUniversitas;
    private int angkatan;
    
    public Universitas(String jurusan, String namaUniversitas, int angkatan) {
        this.namaUniversitas = namaUniversitas;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }
    
    public void NamaUniversitas(String namaUniversitas) {
        this.namaUniversitas = namaUniversitas;
    }
    
    public void Jurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public void Angkatan(int angkatan) {
        this.angkatan = angkatan;
    }
    
    public void Tampilkan() {
        System.out.println("Anda kuliah di " + namaUniversitas + " dengan program studi " + jurusan + " angkatan " + angkatan +" Kom A ");
    }
    
    public static Universitas buatObjek2() {
        Scanner fakhri = new Scanner(System.in);
        System.out.print("Masukkan nama universitas : ");
        String namaUniversitas = fakhri.nextLine();
        System.out.print("Masukkan jurusan          : ");
        String jurusan = fakhri.nextLine();
        System.out.print("Masukkan angkatan         : ");
        int angkatan = fakhri.nextInt();
        fakhri.nextLine(); // membaca newline character setelah membaca bilangan desimal
        return new Universitas(jurusan,namaUniversitas, angkatan);
    }
}
