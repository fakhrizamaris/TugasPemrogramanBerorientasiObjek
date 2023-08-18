/*
AUTHOR : FAKHRI DJAMARIS
NIM    : 222406020
DATE   : 2 MEI 2023
*/
package tugasmaya4;

import java.util.logging.Logger;

class Kendaraan{
    String jenis;
    String merek;
    int tahunProduksi;

    Kendaraan(String jenis, String merek, int tahunProduksi) {
        this.jenis = jenis;
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
    }

    void infoKendaraan(int roda) {
        System.out.println("Saya mempunyai sebuah kendaraan roda " + roda + " dengan jenis kendaraan " + jenis + " dengan spesifikasi :");
    }
}

class Mobil extends Kendaraan {
    Mobil(String jenis, String merek, int tahunProduksi) {
        super(jenis, merek, tahunProduksi);
    }
    
    @Override
    void infoKendaraan(int roda) {
        super.infoKendaraan(roda);
        System.out.println("Merek Mobil\t: " + this.merek );
        System.out.println("Tahun Produksi\t: " + this.tahunProduksi);
    }
    
    void infoKendaraan(String warna) {
        System.out.println("Ini adalah " + jenis + " saya yang berwarna " + warna +".\n");
    }
}

class Motor extends Kendaraan {

    Motor(String jenis, String merek, int tahunProduksi) {
        super(jenis, merek, tahunProduksi);
    }
    
    @Override
    void infoKendaraan(int roda) {
        super.infoKendaraan(roda); 
        System.out.println("Merek Motor\t: " + this.merek );
        System.out.println("Tahun Produksi\t: " + this.tahunProduksi);
    }
    
    void infoKendaraan(String warna) {
        System.out.println("Ini adalah " + jenis + " saya yang berwarna " + warna +".\n");
    }
}

class Truck extends Kendaraan {
    Truck(String jenis, String merek, int tahunProduksi) {
        super(jenis, merek, tahunProduksi);
    }
    
    @Override
    void infoKendaraan(int roda) {
        super.infoKendaraan(roda); 
        System.out.println("Merek Truck\t: " + this.merek);
        System.out.println("Tahun Produksi\t: " + this.tahunProduksi);
    }
    
    void infoKendaraan(String warna) {
        System.out.println("Ini adalah " + jenis + " saya yang berwarna " + warna +".\n");
    }
}

class Gadget{
    String gadget;
    String merek;
    String processor;

    Gadget(String gadget, String merek, String processor) {
        this.gadget = gadget;
        this.merek = merek;
        this.processor = processor;
    }
    
    void infoGadget(int tahunProduksi) {
        System.out.println("Saya mempunyai sebuah Gadget berjenis " + this.gadget + " tahun produksi " + tahunProduksi + " dengan spesifikasi : ");
    }
}

class Laptop extends Gadget {

    Laptop(String gadget, String merek, String processor) {
        super(gadget, merek, processor);
    }

    @Override
    void infoGadget(int tahunProduksi) {
        super.infoGadget(tahunProduksi);
        System.out.println("Merek Laptop\t: " + this.merek);
        System.out.println("Processor\t: " + this.processor);
    }
    
    void infoGadget(String nama) {
        System.out.println("Ini adalah " + gadget + " si " + nama + ".\n");
    }
} 

class Handphone extends Gadget {

    Handphone(String gadget, String merek, String processor) {
        super(gadget, merek, processor);
    }
    
    @Override
    void infoGadget(int tahunProduksi) {
        super.infoGadget(tahunProduksi);
        System.out.println("Merek Handphone\t: " + this.merek);
        System.out.println("Processor\t: " + this.processor);
    }
    
    void infoGadget(String nama) {
        System.out.println("Ini adalah "+ gadget + " si " + nama + ".\n");
    }
}

class Tablet extends Gadget {

    Tablet(String gadget, String merek, String processor) {
        super(gadget, merek, processor);
    }
    
    @Override
    void infoGadget(int tahunProduksi) {
        super.infoGadget(tahunProduksi);
        System.out.println("Merek Tablet\t: " + this.merek);
        System.out.println("Processor\t: " + this.processor);
    }
    
    void infoGadget(String nama) {
        System.out.println("Ini adalah "+ gadget + " si " + nama + ".\n");
    }
} 

public class Main {
    public static void main(String[] args){ 
        
        Mobil supra = new Mobil("Mobil", "Toyota Supra mk4", 2019);
        supra.infoKendaraan(4);
        supra.infoKendaraan("Hitam");
        
        Motor astrea = new Motor("Motor","Astrea 98",1998);
        astrea.infoKendaraan(2);
        astrea.infoKendaraan("Merah");
        
        Truck tronton = new Truck("Truck","Mitsubishi",2015);
        tronton.infoKendaraan(6);
        tronton.infoKendaraan("Putih");
        
        Laptop asus = new Laptop("Laptop", "Asus Vivobook 15", "i5 gen 10");
        asus.infoGadget(2020);
        asus.infoGadget("Fakhri");
        
        Handphone xiaomi = new Handphone("Handphone", "Xiamoi Mi 12 Ultra", "Snapdragon 8 gen 2");
        xiaomi.infoGadget(2022);
        xiaomi.infoGadget("Udin");
        
        Tablet ipad = new Tablet("Tablet", "Ipad", "Snapdragon 860");
        ipad.infoGadget(2020);
        ipad.infoGadget("Ucup");
    }
}