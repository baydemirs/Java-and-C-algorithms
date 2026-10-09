
package kalitim2;

public class Kitaplar {
    public String kitapAdi;
    int ISBN;
    protected String yazar;
    private int sayfaSayisi;
    private double fiyat;
    
    void kitapSec(){
        System.out.println("-------------------------------------------------");
        System.out.println("Secilen Kitap");
        System.out.println("Kitap Adi : "+kitapAdi);
        System.out.println("Kitap ISBN : "+ISBN);
        System.out.println("Kitap Yazar : "+yazar);
        System.out.println("Kitap Sayfa Sayisi : "+sayfaSayisi);
        System.out.println("Kitap Fiyat : "+fiyat);
        System.out.println("-------------------------------------------------");
    }
}
