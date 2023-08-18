/*
AUTHOR : FAKHRI DJAMARIS
NIM    : 222406020
DATE   : 17 MARET 2023
*/
package tugasmaya2;

class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;
    private double luas;
    private double volume;
    
    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang2) {
        this.panjang = panjang + panjang2;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar2) {
        this.lebar = lebar + lebar2;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi2) {
        this.tinggi = tinggi + tinggi2;
    }

    public double getLuas() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public double getVolume() {
        return panjang * lebar * tinggi;
    }

}

public class Main {
   
    public static void main(String[] args) {
        Balok balok1 = new Balok(3.15, 5.15, 4.5);
        System.out.println("Menghitung LUAS dan VOLUME Balok");
        System.out.println(">>>>>>>>>>>>*******<<<<<<<<<<<<<");
        balok1.setPanjang(5);
        System.out.println("Panjang\t\t= " + balok1.getPanjang());
        balok1.setLebar(4.1);
        System.out.println("Lebar\t\t= " + balok1.getLebar());
        balok1.setTinggi(6.5);
        System.out.println("Tinggi\t\t= " + balok1.getTinggi());
        System.out.println(">>>>>>>>>>>>*******<<<<<<<<<<<<<");
        
        System.out.println("Luas Balok\t= " + balok1.getLuas());
        System.out.println("Volume\t\t= " + balok1.getVolume());
    }
    
}



