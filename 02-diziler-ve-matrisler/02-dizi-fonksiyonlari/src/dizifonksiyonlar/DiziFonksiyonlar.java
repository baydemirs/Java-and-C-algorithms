
package dizifonksiyonlar;
import java.util.*;
public class DiziFonksiyonlar {

    public static void main(String[] args) {
        int boyut=boyutDegeriAl();
        int[]dizi=diziolustur(boyut);
        diziYazdir(dizi,boyut);
        diziYazdir(dizi);

    }
    public static int boyutDegeriAl(){
        Scanner klavye=new Scanner(System.in);
        int boyut;
        do {
            System.out.println("Lutfen pozitif bir boyut degeri giriniz = ");
            boyut=klavye.nextInt();
        }while(boyut<=0);
        System.out.println("Dizini Boyut Degeri" + boyut + "olarak tanimlandi");
        return boyut;
    }
    public static int[] diziolustur(int boyut){
        Random rnd=new Random();
        int[]dizi=new int[boyut];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=rnd.nextInt(50,100);
        }
        System.out.println("Dizi OLustu...");
        return dizi;
    }
    public static void diziYazdir(int []dizi,int boyut){
        System.out.println("For Ile Dizi Yazdirildi...");
        for (int i = 0; i < boyut; i++) {
            System.out.print(dizi[i]+"  ");
            
        }
        System.out.println("");
    }
    public static void diziYazdir(int []dizi){
        System.out.println("Forech Ile Dizi Yazdirildi...");
        for (int elaman : dizi) {
            System.out.print(elaman+"  ");
            
        }
    }
     
}
