
package fonksiyonlar;
import java.util.*;
public class Fonksiyonlar {
        /*
        Fonksiyonlar (Metotlar)
        Bir kez yaz cok kez cok yerde kullan
        Kod satırından tasarruf saglanır
        main()fonksiyonunun şişirilmesinin onune gecilir
        Kodun okunabilirligi artar
        Hata bulma ve ayıklama isini kolaylastırır
        Böl ve feth et & tüme varım prensibiyle cozulmesine olanak tanır
        Kod tekrarının önune gecmeye yardımcı olur.
        Statik bir metot iceridsinde yalnızca statik bir programma gecebilir.
        
        FONKSİYONLARIN TANIMLANMASI
        acsess modifiers donus tipi fonksiyon adi (paremetre,argument)fonksiyonun imzasi{
                                                                             body of funetion
                                                                           }
        1- Paremetre Alan (params1,params2,...arg1,arg2)
        2- Parametre Almayan ()
        3- Geriye deger döndüren -> return
        4- Geriye degr dondurmeyen -> void
        
        reurn varsa void yok!
        void varsa return yok!
        */
    public static void main(String[] args) {
        /*
        System.out.println("Min fonksiyonu basladi....");
        yazdir();//Fonksiyonun cagırılması tetiklenmesi
        String mesaj="fonksiyonlar inceleniyor...";
        mesajYazdir(mesaj);
        hesapla(1000);
        double vergi=hesapla2(2000);
        System.out.println("hesapla2 icin vergi"+vergi);
        hesapla3();
        System.out.println("Hesapla3 icin vergi = "+hesapla3());
        //System.out.println("Yazdir calissin = "+yazdir()); HATA
        //System.out.println(yazdir());HATA
        System.out.println("Main fonksiyonu durdu....");
    }
    public static void yazdir(){//parametre almayan, geriye deger dondurmeyen
        System.out.println("yazdir fonksiyonu calisti");
        mesajYazdir("Yazdir fonksiyonu icinden geldim");
    }
    public static void mesajYazdir(String mesaj){//paremetre alan, geriye deger dondurmeyen
        System.out.println("mesajYazdir fonksiyonu calisti mesajiniz : "+mesaj); 
    }
    public static void hesapla(double gelir){//parametre alan geriye deger dondurmeyen
        double vergi=gelir*0.3;
        //mesajYazdir("hesapla2 den geldim :"+vergi);
        System.out.println("Hesapla Fonksiyonu calisti");
        System.out.println("vergi = "+vergi);
    }
    public static double hesapla2(double gelir){//paremetre alan geriye deger donduren
        double vergi=gelir*0.3;
        System.out.println("hesapla fonksiyonu calisti");
        return vergi;
    }
        public static double hesapla3(){//paremetre alamasın geriye deger donduren
        double vergi=1000*0.3;
        System.out.println("hesapla3 fonksiyonu calisti");
        return vergi;
        */
        Scanner klavye=new Scanner(System.in);
    }
    public static void ortalma(int vizeNotu,int finalNotu){//parametre alan geri donussuz
        double ortalama=vizeNotu*0.4 + finalNotu*0.6;
        if (ortalama >= 50){
            System.out.println("Gectiniz");
        }else{
            System.out.println("Kaldiniz");
            
        }
    }

}
