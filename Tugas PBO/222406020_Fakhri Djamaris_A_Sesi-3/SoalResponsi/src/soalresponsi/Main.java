/*
AUTHOR         : SHYALOMITHA STEVANI, M. ALIF FARHAM, NATHANIA ZEFANYA
TANGGAL        : 08 APRIL 2023
TUJUAN PROGRAM : RESPONSI AKBAR
*/
package soalresponsi;
// Class Person sebagai superclass/parent class
class Person {
    private String nama;
    private int umur;
    
    Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    void Sapa() {
        System.out.println("Saya " + getNama() + ", umur saya " + getUmur() + " tahun");
    }
    //1. Buatlah sebuah constructor Person
    // Constructor Person
    

    //2. Buatlah getter dan setter untuk variabel nama
    // Getter dan setter untuk variabel nama
    

    //3. Buatlah getter dan setter untuk variabel nama
    // Getter dan setter untuk variabel umur
    

    //4. Buatlah sebuah method sapa dengan contoh output yang diharapkan: "Saya Shyalomitha, umur saya 19 tahun."
    // Method sapa
    
}

//Lengkapilah program berikut.
// Class Mahasiswa sebagai subclass/child class dari Person
class Mahasiswa extends Person {  //5.
    private String jurusan;

    // Constructor Mahasiswa
    public Mahasiswa(String nama, int umur, String jurusan) {
        super(nama, umur); // Memanggil constructor superclass dengan keyword super
        this.jurusan = jurusan;
    }

    // Getter dan setter untuk variabel jurusan
    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan){   //6.
        this.jurusan = jurusan;
    }

    // Method belajar
    public void belajar() {
        System.out.println("Saya " + getNama() + ", umur saya " + getUmur() + " tahun, Saya belajar mengenai " + getJurusan() + ".");
    }
}

// Class Dosen sebagai subclass/child class dari Person
class Dosen extends Person {   //5.
    private String mataKuliah;

    // Constructor Dosen
    public Dosen(String nama, int umur, String mataKuliah) {
        super(nama, umur); // Memanggil constructor superclass dengan keyword super
        this.mataKuliah = mataKuliah;
    }

    // Getter dan setter untuk variabel mataKuliah
    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {   //7.
        this.mataKuliah = mataKuliah;
    }

    // Method teach
    public void mengajar() {
        System.out.println("Saya " + getNama() + ", umur saya " + getUmur() + " tahun, Saya mengajar Mata Kuliah " + getMataKuliah() + ".");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        //Buat objek Person
        Person person1 = new Person("Alif Farham", 25);
        person1.setNama("Fakhri");
        //Memanggil method dari class Person
        person1.Sapa();
        
        //Buat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Shyalomitha Stevani", 20, "Teknik Informatika");
        
        //Memanggil method dari class Mahasiswa
        mahasiswa1.belajar();
        
        //Buat objek Dosen
        Dosen dosen1 = new Dosen("Nathania Zefanya", 23, "PBO");
        
        //Memanggil method dari class Dosen      
        dosen1.mengajar();
        
        /*
	8.  Buatlah sebuah objek "person" dari class "Person" dengan ketentuan: 
            nama "Alif Farham" 
            umur 25 tahun
            panggil method dari class "Person"
	*/
        // Membuat objek Person
        
        /*
	9.  Buatlah sebuah objek "mahasiswa" dari class "Mahasiswa" dengan ketentuan:
            nama "Shyalomitha Stevani"
            umurnya 20 tahun
            jurusan "Teknik Informatika"
            panggil method dari class "Mahasiswa"
	*/
        // Membuat objek Mahasiswa
        
        /*
	10. Buatlah sebuah objek "dosen" dari class "Dosen" dengan ketentuan:
            nama "Nathania Zefanya"
            umurnya 23 tahun
            mata kuliah yang diajar ialah "PBO"
            panggil method dari class "Dosen"
	*/
        // Membuat objek Dosen
        
    }
    
}

