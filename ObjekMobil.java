public class ObjekMobil {
    
    public static void main(String[] args) {
        MobilDiesel md = new MobilDiesel("Toyota", 600, 200,"solar");
        md.infoMobilDiesel();
        
        MobilBensin mb = new MobilBensin("Supra", 600, 200,"bensin");
        mb.infoMobilBensin();
    }
    
}
