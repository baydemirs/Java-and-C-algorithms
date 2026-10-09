
package oryantasyonodev;
import java.util.*;
public class OryantasyonOdev {

    public static void main(String[] args) {
        
        // Klavyeden Girilen İki Sayi Arasındaki Tek Ve Cift Sayiların Toplamı.
        /*
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Baslangic Degerini Giriniz : ");
        int baslangic=klavye.nextInt();
        
        System.out.print("Bitis Degerini Giriniz : ");
        int bitis=klavye.nextInt();
        
        int tekTop=0,ciftTop=0;
        
        if (baslangic<bitis){
            
        for (int i = baslangic; i <=bitis; i++) {
            
            if (i%2==0){
                ciftTop+=i; // ciftTop=ciftTop+i;
            }else {
                tekTop=tekTop+i; // tekTop+=i
            }
                
            }
        }else{
            
            for (int i = bitis; i < baslangic; i++) {
                if (i%2==0){
                 ciftTop+=i;
                 
                }else {
                    tekTop+=i;
                }
                
            }
        }
            System.out.println("Teklerin Toplami = "+tekTop);
            System.out.println("Ciftlerin Toplami = "+ciftTop);
          
        */
       
        
        /*
        // Cemberin Cevresi Ve Alanını Bulma. 
        
        Scanner klavye = new Scanner(System.in);
        final double PI=3.14;
        System.out.print("Yaricap Degerini Giriniz=");
        
        double r = klavye.nextDouble();
        double alan = PI * r * r;
        double cevre = 2 * PI * r;
        
        System.out.println("Yaricapi"+ r + "girilen cemberin alani="+alan);
        System.out.println("Yaricapi"+ r + "girilen cemberin cevresi="+cevre);
        */
        
        

        /*
        // Bir Şehrin Nufus Değisim Oranı 
        
        int nufus=700000;
        int dogan=14722,olen=5650;
        int gelen=5278,giden=4350;
        int nufusDegisim=dogan+gelen-olen-giden;
        System.out.println("Nufus Degisimi = "+nufusDegisim);
        for (int i = 0; i < 20; i++) {
            nufus=nufus+ nufusDegisim;
        }
        System.out.println("Bayburtun 20 yil sonundaki nufusu = "+nufus);
        if(nufus<1000000){
            System.out.println("Yillar Gecsede Bu Kalp Seni Unuturmu Bayburt");
        }else{
            System.out.println("Yasanacak Sehir Degilsin Bayburt");
        }
        */
        
       
        
        /*
        // İşçinin Çlışma Yılına Göre Net Maaşı.
        
        Scanner klavye=new Scanner(System.in);
        
        int maas=17002,yil,netMaas;
        
        for (int i = 0; i < 7; i++) {
            
            System.out.print((i+1)+". Kisinin Calisma Yilini Giriniz : ");
            yil=klavye.nextInt();
            netMaas=maas*yil;
            System.out.println((i+1)+". Kisinin Net Maasi : "+netMaas);
        }
        System.out.println("Tum Calisanlarin Maasi Hesaplandi");
        */ 
        
        
        
        /*
        // Dort İşlem.
        
        Scanner klavye = new Scanner(System.in); 
        
        int sayi1;
        System.out.print("Birinci Sayiyi Giriniz = ");
        sayi1=klavye.nextInt();
        
        int sayi2;
        System.out.print("ikinci Sayiyi Giriniz = ");
        sayi2=klavye.nextInt();
        
        int toplam, fark, carpim, bolum;
        toplam=sayi1+sayi2;
        fark=sayi1-sayi2;
        carpim=sayi1*sayi2;
        bolum=sayi1/sayi2;
        
        System.out.println(" islem 1: " + sayi1 + " + " + sayi2 + " = " + toplam);
        System.out.println(" islem 2: " + sayi1 + " - " + sayi2 + " = " + fark);
        System.out.println(" islem 3: " + sayi1 + " * " + sayi2 + " = " + carpim);
        System.out.println(" islem 4: " + sayi1 + " / " + sayi2 + " = " + bolum);
        */
        
        
        
        /*
        // Boy Kilo İndeksi Hesaplama.
        
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Boy Degerini Giriniz = ");
        double boy=klavye.nextDouble();
        
        System.out.print("Agirlik Degerini Giriniz = ");
        double kilo=klavye.nextDouble();
        
        double bmi=kilo/ (boy*boy);
        
        if (bmi<18.5){
            System.out.println("Zayif");
            
        }else if (bmi<25){
            System.out.println("Normal");
            
        }else if (bmi<30){
            System.out.println("Kilolu");
            
        }else if (bmi<35){
            System.out.println("Obez");
            
        }else{
            System.out.println("Asiri Obez"); 
        }
        */
        
        
        
        /*
        // Aylar.
        
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Lutfen Ay Numarasini Giriniz = ");
        int ay=klavye.nextInt();
        
        switch (ay){
            case 1:
            System.out.println(ay+" . Ay : Ocak");
            break;
            case 2:
            System.out.println(ay+" . Ay : Subat");
            break;
            case 3:
            System.out.println(ay+" . Ay : Mart");
            break;
            case 4:
            System.out.println(ay+" . Ay : Nisan");
            break;
            case 5:
            System.out.println(ay+" . Ay : Mayis");
            break;
            case 6:
            System.out.println(ay+" . Ay : Haziran");
            break;
            case 7:
            System.out.println(ay+" . Ay : Temmuz");
            break;
            case 8:
            System.out.println(ay+" . Ay : Agustos");
            break;
            case 9:
            System.out.println(ay+" . Ay : Eylul");
            break;
            case 10:
            System.out.println(ay+" . Ay : Ekim");
            break;
            case 11:
            System.out.println(ay+" . Ay : Kasim");
            break;
            case 12:
            System.out.println(ay+" . Ay : Aralik");
            break;
            default:
                System.out.println("Miladi Takvim'de "+ay+" . Ay Yoktur ");
                break;
        }    
        */
        
        
        
        /*
        // Sınav Notu Hesaplama.
        
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Vize Notunuzu Giriniz = ");
        int vizeNotu=klavye.nextInt();
        
        System.out.print("Final Notunuzu Giriniz = ");
        int finalNotu=klavye.nextInt();
        
        double ortalama=vizeNotu*0.4 + finalNotu*0.6;
        System.out.println("Ortalama : "+ortalama);
        
        if(finalNotu>=50){
        
        if (ortalama>=90){
            System.out.println("Gecti : AA");
            
        }else if(ortalama>=80){
            System.out.println("Gecti : BB");
            
        }else if(ortalama>=70){
            System.out.println("Gecti : CC");
            
        }else if(ortalama>=60){
            System.out.println("Gecti : DC");
            
        }else if(ortalama>=50){
            System.out.println("Gecti : DD");
            
        }else{
            System.out.println("Kaldi : FF");
        }
    
        }else{
            System.out.print("Final Notu En Az 50 Olmali : ");
            System.out.println("Kaldiniz");
        }
        */
        
        
        
        /*
        // Yaş Hesaplama.
        
        Scanner klavye = new Scanner(System.in);
      
        int yil;
        System.out.print("Lutfen Dogum Yililnizi Giriniz=");
        yil=klavye.nextInt();
        
        int yas=2024-yil;
        System.out.println(yas + ". Yasindasiniz");
        */
         
        
        
        /*
        // Bolme İşlemi.
        
        Scanner klavye = new Scanner(System.in);
      
        System.out.print("Lutfen Bolunen Degeri Giriniz = ");
        float bolunen=klavye.nextFloat();
        
        System.out.print("Lutfen Bolen Degerini Giriniz = ");
        float bolen=klavye.nextFloat();
        
        float kalan=bolunen%bolen;
        System.out.println("bolunen =>" + bolunen + "bolen =>" + bolen + "kalan =>"+kalan);
        */
        
        
            
    }
    
}
