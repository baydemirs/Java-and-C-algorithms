
package javaminiprojeler;
import java.util.Scanner;
public class JavaMiniProjeler {

    public static void main(String[] args) {
        /*
        //Asal sayi 
        Scanner klavye=new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int sayi=klavye.nextInt();
        
        int kalan=sayi%2;
        boolean asalSayi=true;
        
        if(sayi==1){
            System.out.println("Sayi Asal Degildir...");
            return;
        }
        
        for (int i = 2; i < sayi; i++) {
            if(sayi % i==0){
                asalSayi=false;
            }
        }
        if(asalSayi){
            System.out.println("Sayi Asaldir...");
        }else{
            System.out.println("Sayi Asal Degildir...");
        }
        
        
        // Kalin sesli ince sesli harf bulma
        char harf='O';
        switch (harf){
            case 'A':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("Kalin Sesli Harf");
                break;
            default:
                System.out.println("Ince Sesli Harf");
        }
          
        //Mukemmel Sayi
        Scanner klavye=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        int sayi=klavye.nextInt();
        
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if(sayi % i==0){
                toplam=toplam+i;
            }
            
        }
        if(toplam==sayi){
            System.out.println("Mukemmel Sayidir...");
        }else{
            System.out.println("Mukemmel Sayi Degildir...");
        }
        
        
        
        // Arkadaş Sayi Bulma
        
        Scanner klavye=new Scanner(System.in);
       
        System.out.print("Birinci Sayiyi Giriniz : ");
        int sayi1=klavye.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz : ");
        int sayi2=klavye.nextInt();
        int toplam1=0;
        int toplam2=0;
        
        for (int i = 1; i < sayi1; i++) {
            if(sayi1 % i==0){
                toplam1+=i;
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if(sayi2 % i==0){
                toplam2+=i;
            }
        }
        if(sayi1==toplam2 && sayi2==toplam1){
            System.out.println("Arkadas Sayilardir...");
        }
        else{
            System.out.println("Arkadas Sayilar Degildir...");
        }
        */
        
        int[] sayilar=new int[]{1,2,3,5,0,9};
        int bulunacak =1;
        boolean varMi=false;
        
        for (int sayi1 : sayilar) {
            if(sayi1==bulunacak){
                varMi=true;
                break;
            }
            
        }
        if(varMi){
            System.out.println("Sayi Mevcuttur!!!");
        }else{
            System.out.println("Sayi Mevcut Degildir!!!");
        }
        
    }
    
}
