
package kalitim2;

public class Kalitim2 {

    public static void main(String[] args) {
        Kitaplar k1=new Kitaplar();
        k1.kitapAdi="Kitap-1";
        k1.yazar="Yazar-1";
        k1.ISBN=1234567891;
        k1.kitapSec();
        
        BasiliKitaplar bk1=new BasiliKitaplar();
        bk1.kitapAdi="Basili Kitap-2"; // kitap class
        bk1.yazar="Kitap Kitap Yazar-2"; // kitap class
        bk1.ISBN=1234567892; // kitap class
        bk1.ciltKitap="Krton kapak"; // kendi class
        bk1.kitapSec(); // kitap class
        
        EKitaplar ek1=new EKitaplar();
        ek1.kitapAdi="E Kitap-3"; // kitap class
        ek1.yazar="EKitap Yazar-3"; // kitap class
        ek1.ISBN=1234567892; // kitap class
        ek1.orijinalMi=true; // kendi class
        ek1.kitapSec(); // kitap class
        
        SesliKitaplar sk1=new SesliKitaplar();
        sk1.kitapAdi="Sesli Kitap-3"; // kitap class
        sk1.yazar="Sesli Kitap Yazar-3"; // kitap class
        sk1.ISBN=1234567892; // kitap class
        sk1.seslendiren="Seslendiren-1"; // kendi class
        sk1.kitapSec(); // kitap class
        
        UniversiteKitaplari uk1=new UniversiteKitaplari();
        uk1.kitapAdi="Universite Kitap-3"; // kitap class
        uk1.yazar="Universite Kitap Yazar-3"; // kitap class
        uk1.ISBN=1234567892; // kitap class
        uk1.ciltKitap="Karton"; // BasiliKitaplar class
        uk1.cevirmen="Universite Kitap Cevirmen-5"; // kendi class
        sk1.kitapSec(); // kitap class
        uk1.ceviri(); // kendi class
        System.out.println("-------------------------------------------------");
        
        IngilizceKitaplari ik1=new IngilizceKitaplari();
        ik1.kitapAdi="Universite Kitap-6"; // kitap class
        ik1.yazar="Universite Kitap Yazar-6"; // kitap class
        ik1.ISBN=1234567892; // kitap class
        ik1.ciltKitap="Karton"; // BasiliKitaplar class
        ik1.alistirma=true; // kendi class
        ik1.kitapSec(); // kitap class
        ik1.ceviri(); // kendi class
        System.out.println("-------------------------------------------------");
    }
    
}
