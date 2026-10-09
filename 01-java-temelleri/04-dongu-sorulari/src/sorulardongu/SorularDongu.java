
package sorulardongu;
import java.util.Scanner;
public class SorularDongu {

    public static void main(String[] args) {
        
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
        int toplam=0;
        for (int i = 1; i <= 100; i++) {
            if (i%2==0 && i%5==0 && i%7!=0){
                toplam=toplam+i;
                System.out.println("Kosul Saglandi = "+i);
            }
            
        }
        System.out.println("Toplam = "+toplam);
        
        */
        
        
        /*
        Scanner klavye=new Scanner(System.in);
        
        int yaricap;
        
        do{
            System.out.print("Pozitif Yaricap Degerini Giriniz = ");
            yaricap=klavye.nextInt();
            
        }while (yaricap<0);
        System.out.println("Cevre = "+(2*3.14*yaricap));
        System.out.println("Alan = "+(3.14*yaricap*yaricap));
        */
        
        
        /*
        float x1=12f,t1=20f/60f;
        float v1=x1/t1;
        System.out.println("Ilk Hiz = "+v1);
        float x2=30f;
        float v2=v1*1.5f;
        float t2=x2/v2;
        System.out.println("Gecen Zaman = "+t2);
        if(t2>(30/60)){
            System.out.println("Tesekkurler");
        }else{
            System.out.println("Yuksek Hiz Tehlike.....!");
        }
        */
        

        /*
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
        Scanner klavye=new Scanner(System.in);
        
        int maas=12000,yil,netMaas;
        
        for (int i = 0; i < 7; i++) {
            
            System.out.print((i+1)+". Kisinin Calisma Yilini Giriniz : ");
            yil=klavye.nextInt();
            netMaas=maas*yil;
            System.out.println((i+1)+". Kisinin Net Maasi : "+netMaas);
        }
        System.out.println("Tum Calisanlarin Maasi Hesaplandi");
        */
        
        /*
        int omerDers=4,omerPratik=4;
        int ahmetDers=3,ahmetPratik=5;
        double omerPerformanss=omerDers*0.6+omerPratik*0.4;
        double ahmetPerformanss=ahmetDers*0.6+omerPratik*0.4;
        System.out.println("Ahmet Performans : " + ahmetPerformanss);
        System.out.println("Omer Performans : " + omerPerformanss);
        if (omerPerformanss>ahmetPerformanss){
            System.out.println("Performansin Kazanani OMER!");
        }else {
            System.out.println("Performansin Kazanani AHMET!");
        }
        */
        
        /*
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Satir Sayisini Giriniz : ");
        int satir=klavye.nextInt();
        
        System.out.print("Sutun Sayisini Giriniz : ");
        int sutun=klavye.nextInt();
        
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        */
        
        
        /*
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Satir Sayisini Giriniz : ");
        int satir=klavye.nextInt();
        
        System.out.print("Sutun Sayisini Giriniz : ");
        int sutun=klavye.nextInt();
        
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (j<=i){
                System.out.print(" * ");
            }else {
                    System.out.print("   ");
                }
            }
            System.out.println(""); 
        }
        */
        
        /*
            Scanner klavye=new Scanner(System.in);
        
        System.out.print("Satir Sayisini Giriniz : ");
        int satir=klavye.nextInt();
        
        System.out.print("Sutun Sayisini Giriniz : ");
        int sutun=klavye.nextInt();
        
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (j>=i){
                System.out.print(" * ");
            }else {
                    System.out.print("   ");
                }
            }
            System.out.println(""); 
        }
        
        */
        }
       
    }
    
