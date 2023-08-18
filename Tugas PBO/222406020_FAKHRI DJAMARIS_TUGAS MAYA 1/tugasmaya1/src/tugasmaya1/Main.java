/*
 AUTHOR : FAKHRI DJAMARIS
 PROJEK : CLASS, OBJECT, DAN METHOD
 DATE   : 11 MARET 2023
*/
package tugasmaya1;

public class Main {
    public static void main(String[] args) {
        // buat objek
        Manusia manusia1 = Manusia.buatObjek();
        Universitas universitas = Universitas.buatObjek2();
        
        // panggil method
        manusia1.perkenalan();
        universitas.Tampilkan();
    }
}