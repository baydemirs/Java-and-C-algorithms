
package finalhazirlik2;
import java.util.*;
public class FinalHazirlik2 {

    public static void main(String[] args) {
        /*
        Scanner klavye=new Scanner(System.in);
        Random rnd=new Random();
        double[]dizi=new double[5];
        System.out.println("Lutfen "+dizi.length+"sayi giriniz: ");
        for(int i=0; i<dizi.length; i++){
            dizi[i]=klavye.nextDouble();
        }
        for(int i=0; i<dizi.length; i++){
            System.out.println(dizi[i]+ " ");
        }
        
        
        
        double[]benimDizi=new double[4];
        Scanner klavye=new Scanner(System.in);
        for (int i = 0; i < benimDizi.length; i++) {
            System.out.printf("benimDizi[%d] : ",i );
            benimDizi[i]=klavye.nextDouble();
        }
        for (int i = 0; i < benimDizi.length; i++) {
            System.out.printf("benimDizi[%d] = %5.1f" + "\n",i,benimDizi[i]);
        }
        
        
        
        char []sehir={'i','s','t','a','n'};
        System.out.println(sehir);
        
        
        
        
        Scanner klavye=new Scanner(System.in);
        String[]aylar ={"ocak","subat","mart","nisan","mayis","haziran","temmuz","agustos","eylul","ekim","kazim","aralik"};
        System.out.println("bir ay no giriniz (1-12)");
        int ay=klavye.nextInt();
        System.out.println("Ay"+aylar[ay-1]);
        

        Scanner klavye=new Scanner(System.in);
        String[]aylar ={"ocak","subat","mart","nisan","mayis","haziran","temmuz","agustos","eylul","ekim","kazim","aralik"};
        for(String ay:aylar){
            System.out.println(ay);
        }
        
        
        
        int[]deste=new int[52];
        String []gruplar = {"maca","kupa","karo","sinek"};
        String []siralar = {"as","2","2","4","5","6","7","8","9","10","joker","kiz","papaz"};
        //kartlarin baslangici
        for (int i = 0; i < deste.length; i++) {
            deste[i]=i;
            //kartlari karistirma
            for (int j = 0; j < deste.length; j++) {
                //rastgele bir index olusturcam
                int index=(int) (Math.random() * deste.length);
                int temp=deste[i];
                deste[i]=deste[index];
                deste[index]=temp;
            }
            //ilk dort kartı goster
            for (int j = 0; j < 4; j++) {
                String grup=gruplar[deste[i] /13];
                String sira=siralar[deste[i] *13];
                System.out.println("kart numarasi : "+deste[i]+ ": "+sira+ " - "+grup);
            }
        }
        
        
        Scanner klavye=new Scanner(System.in);
        Random rnd=new Random();
        String[]tkm={"Tas","Kagit","Makas"};
        System.out.print("Secim-->{Tas->0, Kagit->1, Makas->2}");
        int secim=klavye.nextInt();
        int program=rnd.nextInt(3);
        
        System.out.println("Program : "+tkm[program]);
        System.out.println("Sen : "+tkm[secim]);
        
        if(secim==0 && program==2 || secim==1 && program==0 || secim==2 && program==1){
            System.out.println("kazandiniz!");
        }else if(secim==0 && program==0 || secim==1 && program==1 || secim==2 && program==2){
            System.out.println("berabere!");
        }else{
            System.out.println("kaybettiniz!");
        }
        */
        
        
        Scanner klavye=new Scanner (System.in);
        System.out.print("boyutu giriniz : ");
        if (!klavye.hasNextInt()) {
            System.out.println("Gecersiz boyut degeri.");
            return;
        }
        int n=klavye.nextInt();
        if (n <= 0 || n > 1_000_000) {
            System.out.println("Boyut 1 ile 1000000 arasinda olmalidir.");
            return;
        }
        
        double[]sayilar=new double[n];
        double toplam=0;
        
        System.out.print("Sayilari giriniz : ");
        for (int i = 0; i < n; i++) {
            if (!klavye.hasNextDouble()) {
                System.out.println("Gecersiz sayi girildi.");
                return;
            }
            sayilar[i]=klavye.nextDouble();
            toplam+=sayilar[i];
        }
        double ortalama=toplam/n;
        
        int sayac=0;// ortalamamın ustundeki elaman sayisi
        for (int i = 0; i < n; i++) {
            if(sayilar[i]>ortalama) {
                sayac++;
            }
        }
        System.out.println("ortalama : "+ortalama);
        System.out.println("ortalamanin ustundeki elaman sayisi : "+sayac);
    }
    
}


