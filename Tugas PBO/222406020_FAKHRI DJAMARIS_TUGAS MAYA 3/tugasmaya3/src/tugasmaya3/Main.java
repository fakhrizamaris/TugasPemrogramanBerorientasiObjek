package tugasmaya3;

class Kendaraan{
    String jenis;
    
    Kendaraan(String jenis){
        this.jenis = jenis;   
    }
    
    public void infoKendaraan() {
        System.out.println("Saya mempunyai sebuah Kendaraan dengan jenis Kendaraan " + jenis + " dengan spesifikasi :");
    }
}

class Mobil extends Kendaraan {
    String merekMobil;
    int tahunProduksi;

    Mobil(String jenis, String merekMobil, int tahunProduksi) {
        super(jenis);
        this.merekMobil = merekMobil;
        this.tahunProduksi = tahunProduksi;
    }
    
    public void infoMobil() {
        System.out.println("Merek Mobil\t: " + merekMobil );
        System.out.println("Tahun Produksi\t: " + tahunProduksi);
    }
}

class Gadget{
    String laptop;
    
    
    Gadget(String laptop){
        this.laptop = laptop;
        
    }
    
    public void infoGadget() {
        System.out.println("\nSaya mempunyai sebuah Gadget berjenis " + laptop + " dengan spesifikasi : ");
    }
}

class Laptop extends Gadget {
    String merek;
    int tahun;
    String processor;
    
    Laptop(String laptop, String merek, int tahun, String processor ) {
        super(laptop);
        this.merek = merek;
        this.tahun = tahun;
        this.processor = processor;
    }
    
    public void infoLaptop() {
        System.out.println("Merek Laptop\t: " + merek);
        System.out.println("Tahun keluaran\t: " + tahun);
        System.out.println("Processor\t: " + processor);
    }
} 

public class Main {
    public static void main(String[] args){
        Kendaraan fakhri = new Kendaraan("Mobil");
        fakhri.infoKendaraan(); 
        
        Mobil supra = new Mobil("Mobil", "Supra mk4", 2019);
        supra.infoMobil();
        
        Gadget fakhri2 = new Gadget("Laptop");
        fakhri2.infoGadget();
        
        Laptop asus = new Laptop("Laptop", "Asus Vivobook 15", 2019, "i5 gen 10");
        asus.infoLaptop();
    }
}