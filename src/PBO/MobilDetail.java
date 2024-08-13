package PBO;

//Inheritance
public class MobilDetail extends Mobil{
    //overriding
    public MobilDetail(String nama, String merk) {
        super(nama, merk);
    }
    
    public String getProvinsi(){
        String kodeProv = getPlat().substring(0, 2);
        //seleksi if
        if(kodeProv.equals("DA")){
            return "Kalimantan Selatan";
        }else {
            return "Provinsi Lain";
        }
    }
    
    public int getNomorPlat(){
        return Integer.parseInt(getPlat().substring(2, 6));
    }
    
    public String getDaerah(){
        String kodeDaerah = getPlat().substring(6);
        //seleksi switch
        switch(kodeDaerah){
            case"A":
                return "Banjarmasin";
            case"P":
                return "Banjarbaru";
            default:
                return "Daerah Lain";
        }
    }
    //polymorphism (overriding)
    @Override
    public String tampilkanInfo(){
        return super.tampilkanInfo()+
                "\nProvinsi : "+getProvinsi()+
                "\nNomor Plat : "+getNomorPlat()+
                "\nDaerah: "+getDaerah();               
    }
}