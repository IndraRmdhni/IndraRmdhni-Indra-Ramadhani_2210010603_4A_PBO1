package PBO;
//class
public class Mobil {
    //atribut dan encapsulation
    private String nama;
    private String plat;

    //constructor
    public Mobil(String nama, String plat) {
        this.nama = nama;
        this.plat = plat;
    }
    
    //mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMerk(String plat) {
        this.plat = plat;
    }
    
    //accesor
    public String getNama() {
        return nama;
    }

    public String getPlat() {
        return plat;
    }
    
    public String tampilkanInfo(){
        return "Nama Mobil : "+getNama()+"\nPlat : "+getPlat();
    }
    
    //polymorphism (overloading
    public String tampilkanInfo(String harga){
        return tampilkanInfo() + "\nHarga : "+harga;
    }
}
