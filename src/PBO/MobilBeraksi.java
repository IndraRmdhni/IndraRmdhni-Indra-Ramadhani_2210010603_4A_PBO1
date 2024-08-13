package PBO;

import java.util.Scanner;

public class MobilBeraksi {
    public static void main(String[] args) {
        //Objek
        //Mobil mbl = new Mobil("Brio","DA1000AGR");
        
        //System.out.println(mbl.tampilkanInfo());
        //System.out.println(mbl.tampilkanInfo("100.000.000"));
        //Error Handling
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);

            //Array
            MobilDetail[] mbl = new MobilDetail[2];

            for(int i=0; i<mbl.length; i++){
                System.out.print("Nama Mobil "+(i+1)+" : ");
                String nama = scanner.nextLine();
                System.out.print("Plat Mobil "+(i+1)+" : ");
                String plat = scanner.nextLine();

                //objek
                mbl[i] = new MobilDetail (nama, plat);
            }

            //perulangan
            for(MobilDetail data: mbl){
                System.out.println("==================");
                System.out.println("Data Mobil");
                System.out.println(data.tampilkanInfo());
            }
                
        }   catch (Exception e){
                System.out.println("Kesalahan Umum : "+e.getMessage());
        }    
    }
}
