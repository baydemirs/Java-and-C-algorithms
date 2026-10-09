
package ornek2;

import java.util.*;

public class Ornek2 {

    public static void main(String[] args) {
       
        
        /*
        //if Statement
        //Type1
        //if(kosul) {  kosul==True =>body of if Statement  }
        
        Scanner klavye = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayi Giriiniz = ");
        int sayi=klavye.nextInt();
        
        // Type 1:only if statement
        
        if (sayi>=0){
            System.out.println("Girilen Pozitif Sayi="+sayi);
            
        }
        System.out.println("Girilen Sayi="+sayi);
        */   
        
        
        
        /*
        
        Scanner klavye = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayi Giriiniz=");
        int sayi=klavye.nextInt();
        
        // Type 1:only if statement
        // if (sayi>0) govde tek sayi ise {} govde kullanmayacaz.
        if (sayi>=0)
            System.out.println("Girilen Pozitif Sayi="+sayi);
           
        System.out.println("Girilen Sayi="+sayi);
        System.out.println("Girilen Sayi="+sayi);
        System.out.println("Girilen Sayi="+sayi);
        
        */
        
        /*
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Vize Notunuzu Giriniz = ");
        int vizeNotu=klavye.nextInt();
        
        System.out.print("Final Notunuzu Giriniz = ");
        int finalNotu=klavye.nextInt();
        
        double ortalama=vizeNotu*0.4 + finalNotu*0.6;
        System.out.println("Ortalama : "+ortalama);
        
        if (ortalama >= 50){
            System.out.println("Gectiniz");
        }else{
            System.out.println("Kaldiniz");
        }
        */
        
        
        /*
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
        Random rnd=new Random();
        
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Lutfen Bir Sayi Giriniz = ");
        int sayi1=klavye.nextInt();
        
        int sayi2=rnd.nextInt(50, 100);
        System.out.println("Girilen Sayi : "+sayi1);
        System.out.println("Rastgele Olusturulan Sayi : "+sayi2);
        
        */
        /*
        Scanner klavye=new Scanner(System.in);
        
        Random rnd=new Random();
        
        int sayi1=rnd.nextInt(101);
        int sayi2=rnd.nextInt(100)+1;
        int islem=rnd.nextInt(4);
        
        int cevap=0,sonuc=0;
        //0(topla)-1(fark)-2(carp)-3(bol)
        
        if (islem==0){
            System.out.println(sayi1 + " + " + sayi2 + "=?");
            sonuc=sayi1+sayi2;
            System.out.print("Cevabiniz = ");
            cevap=klavye.nextInt();
            
        }else if (islem==1){
            System.out.println(sayi1 + " - " + sayi2 + "=?");
            sonuc=sayi1-sayi2;
            System.out.print("Cevabiniz = ");
            cevap=klavye.nextInt();
            
        }else if (islem==2){
            System.out.println(sayi1 + " * " + sayi2 + "=?");
            sonuc=sayi1*sayi2;
            System.out.print("Cevabiniz = ");
            cevap=klavye.nextInt();
            
        }else if (islem==3){
            System.out.println(sayi1 + " / " + sayi2 + "=?");
            sonuc=sayi1/sayi2;
            System.out.print("Cevabiniz = ");
            cevap=klavye.nextInt();
            
        }if (sonuc==cevap){
        System.out.println(" !**** Tebrikler Kazandiniz ****!");
        
        }else{
            System.out.println("Yalnis Cevap !**** Kaybettiniz ****!");
        }
        */
    } 
    
}
