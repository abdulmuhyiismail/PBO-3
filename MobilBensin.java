//modifier class nama_class extends nama_super_class
public class MobilBensin extends mobil{
    
    String bahan_bakar;
    
    MobilBensin(String merk, int harga, int kecepatan, String bahan_bakar){
        super(merk,harga,kecepatan);
        this.bahan_bakar = bahan_bakar;
        
    }
    void setBahanBakar(String bahan_bakar){
        this.bahan_bakar = bahan_bakar;
        
    }
    
    String getBahanBakar(){
        return bahan_bakar;
    }
    
    void infoMobilBensin(){
        super.infoMobil();
        System.out.println("Bahan_bakar;" + getBahanBakar());
        System.out.println("-----------------------------");
    }
}