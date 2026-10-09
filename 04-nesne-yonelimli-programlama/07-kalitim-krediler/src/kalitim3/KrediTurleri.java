
package kalitim3;

public class KrediTurleri {
    public String verilenKredi;
    String krediTuru;
    protected  int vadeSayisi;
    public double krediTutari;
    public double faizOrani;
    
     KrediTurleri(double faizOrani){
        this.faizOrani=faizOrani;
    }
    double odenecekTutar(){
        double faizTutari = (krediTutari / 100) * faizOrani * vadeSayisi;
        return krediTutari + faizTutari;
    }
    void krediBilgileriniGöster(){
        System.out.println("Verilen Kredi : "+verilenKredi);
        System.out.println("Kredi Turu : "+krediTuru);
        System.out.println("Vade Sayisi : "+vadeSayisi);
        System.out.println("Kredi Tutari : "+krediTutari);
        System.out.println("Faiz Orani : "+faizOrani);
        System.out.println("Odenecek Tutar : "+odenecekTutar());
        
    }
}
