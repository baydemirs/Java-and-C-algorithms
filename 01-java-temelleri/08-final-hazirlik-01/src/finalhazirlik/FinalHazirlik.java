
package finalhazirlik;
import java.util.*;
public class FinalHazirlik {

    public static void main(String[] args) {
        /*
        Random rnd=new Random();
        Scanner klavye=new Scanner(System.in);
        String [] tkm={"tas,kagit makas"};
        int program=(int)(Math.random()*3);
        int program=rnd.nextInt(3);
        System.out.println(program);
        if(program==0){
            System.out.println("Program"+tkm[0]);
        }else if(program==1){
            System.out.println("Program"+tkm[1];
        }else{
            System.out.println("Program"+tkm[2];
        }
        //kullanıcı secimi
        System.out.println("tas-> 0,kagit->1,makas->2 Hangisi?");
        int kullanici=klavye.nextInt();
        //System.out.println("Seciniz"+tkm[kullanici]);
        if(kullanici==0){
            System.out.println("sen"+tkm[0]);
        }else if(program==1){
            System.out.println("sen"+tkm[1];
        }else{
            System.out.println("sen"+tkm[2];
        }
        //kurallar
        if(kullanici==0 && program==2)||(kullanici==1 && program==0) ||(kullanici==2 &&)
        */
        
        
        /*
        Scanner klavye=new Scanner(System.in);
        System.out.print("Lutfen Fibonacci Dizisinin Elaman Sayisini Giriniz : ");
        int boyut=klavye.nextInt();
        int []fibonacci=new int[boyut];
        fibonacci[0]=0;
        fibonacci[1]=1;
        //dizi olusturuluyor
        for (int i = 2; i < boyut; i++) {
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2]; 
        }
        //dizi yazdırılıyor
        for (int i = 2; i < boyut; i++) {
            System.out.println(fibonacci[i]+"  ");
        }
        */
        
        /*
        System.out.print(" ! ! ! ! ");
        for (int i = 1; i < 5; i++) {
            System.out.print(" ! ! ! "+i);
        }System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print(" - - - - ");
        }System.out.println("");
        for (int i = 1; i < 6; i++) {
            System.out.print(i+" > * * ");
            for (int j = 1; j < 5; j++) {
                System.out.print("- "+i+" 0 "+j+" ");
            }System.out.println("");
        }
        */
        
        /*
        Scanner klavye=new Scanner(System.in);
        String paswod="yazilim 2024";
        int kontrol=0;
        while(kontrol<5){
        System.out.println("Kullanici Sifresini Giriniz");
        String sifre=klavye.next();
        if(paswod.equalsIgnoreCase(sifre)){
            System.out.println("Hos Geldiniz Program");
            break;
        }else{
            System.out.println("Sifre Yalnis Tekrar Giriniz");
            kontrol++;
        }
        
        }
        
        */
        

        Random rnd=new Random();
        Scanner klavye=new Scanner(System.in);
        /*String [] tkm={"Tas","Kagit","Makas"};
        
        // Kullanici secim yapiyor....
        System.out.println("SEC ---> {Tas -> 0, Kagit -> 1, Makas ->2 }");
        int secim=klavye.nextInt();
        
        // Program rasgele secim yapiyor....
        //int program=(int)Math.random()*3;
        int program=rnd.nextInt(3);
        if (program==0) {
            System.out.println("Program : "+tkm[0]);
        }else if(program==1){
            System.out.println("Program : "+tkm[1]);
        }else{
            System.out.println("Program : "+tkm[2]);
        }
        //System.out.println("Program : "+tkm[program]);
        
        if (secim==0) {
            System.out.println("Sen : "+tkm[0]);
        }else if(secim==1){
            System.out.println("Sen : "+tkm[1]);
        }else{
            System.out.println("Sen : "+tkm[2]);
        }
        //System.out.println("Sen : " +tkm[secim]);
        if (secim==0 && program==2 ||
            secim==1 && program==0 ||
            secim==2 && program==1) {
            System.out.println("Kazandiniz !");
        }else if (secim==0 && program==0 ||
            secim==1 && program==1 ||
            secim==2 && program==2) {
            System.out.println("Berabere !");
        }else {
            System.out.println("Kaybettiniz!");
        }
        
        
        
        
        /*
        int a=2222,b=1111;
        System.out.print("a+b:");
        System.out.println(a + ++b);
        System.out.println("a+b:"+ a + b);
        //System.out.printf(" %d     %f   %s %c %b \n",1,2f,"3",'a',true);
        // %d -> int
        // %f -> float
        // %c -> char
        // %s -> string
        // %b -> boolean
        b=-a++;
        // - varsa -> sağdan boşluk bırakmaya başla
        // - yoksa -> soldan boşluk bırakmaya başla
        System.out.printf("a+b:000%-5d",a*b); 
        // float ifadelerin yazdırılması
        System.out.println("");
        System.out.printf("%.5f",3.146575326f);
        
        System.out.print("Lutfen Fibonacci dizisinin boyut degerini giriniz : ");
        int boyut=klavye.nextInt();
        int []sayilar=new int[boyut];
        sayilar[0]=0;
        sayilar[1]=1;
        // Dizi olusturuluyor...
        for (int i = 2; i < sayilar.length; i++) {
            sayilar[i]=sayilar[i-1]+sayilar[i-2];
        }
        //Dizi yazdiriliyor..
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i]+"   ");
        }
        
        // Dizi olusturuluyor...
        double []sira={0.1,1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9,9.0};
        System.out.println("Dizi Yazdiriliyor....");
        for (int i = 0; i < sira.length; i++) {
            System.out.print(sira[i]+"   ");
        }
        System.out.println("");
        double temp;
        for (int i = 0; i < sira.length; i++) {
            for (int j = i; j < sira.length; j++) {
                if (sira[j]>sira[i]) {
                    temp=sira[i];
                    sira[i]=sira[j];
                    sira[j]=temp;
                }
            }
        }
        // Dizi yazdiriliyor..
        System.out.println("Dizi B'den K'ya yazdiriliyor....");
        for (int i = 0; i < sira.length; i++) {
            System.out.print(sira[i]+"   ");
        }
    
        System.out.print("! ! ! !");
        for (int i = 1; i < 5; i++) {
            System.out.print(" ! ! ! "+i);
        }System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print("- - - - ");
        }System.out.println("");
        int satir=5,sutun=4;
        for (int i = 1; i < 6; i++) {
            System.out.print(i+ " > * * ");
            for (int j = 1; j < 5; j++) {
                System.out.print("- " + i +" 0 "+j+" ");
            }System.out.println("");
        }
    
        String passwd="Yazilim2024";
        int denemeHakki=0;
        while(denemeHakki<5){
        System.out.println("Lutfen sifre giriniz : ");
        String sifre=klavye.next();
            if (sifre.equals(passwd)) {
                System.out.println("Hos geldiniz. Program Basliyor.");
                break;
            }
            else {
                denemeHakki++;
                if (denemeHakki==5) {
                    System.out.println("Sistem Bloke");
                }
                else {
                    System.out.println("Sifre yanlis tekrar giriniz");
                }
            }
        }
       
        String []mevsimler={"Ilkbahar","Yaz","Sonabahar","Kis"};
        System.out.println("Lutfen mevsim no (1-4) giriniz : ");
        int mevsimNo=klavye.nextInt();
        System.out.println("Secilen mevsim="+mevsimler[mevsimNo-1]);
     */ 
        
    }   
}
    

