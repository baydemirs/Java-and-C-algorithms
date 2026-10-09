
package kalitim4;

public class Calisanlar {
    public String isim;
    public String soyIsim;
    public String departman;
    public int yillikIzinSayisi;
    public double ekUcret;
    public double maas;
    Calisanlar(){
        
    }
    
    Calisanlar(String isim,String soyIsim){
        this.isim=isim;
        this.soyIsim=soyIsim;
    }
    double maasHesapla (){
        return maas+ekUcret+yillikIzinSayisi*500;
    }
    void bilgileriYazdir(){
        System.out.println("-------------------------------------------------");
        System.out.println("Calisan isim :"+isim);
        System.out.println("Calisan SoyIsim : "+soyIsim);
        System.out.println("Calisan departman : "+departman);
        System.out.println("Calisan Yillik izin sayisi : "+yillikIzinSayisi);
        System.out.println("Calisan ek ucret : "+ekUcret);
        System.out.println("Calisan net maas : "+maas);
        System.out.println("-------------------------------------------------");
    }
}
