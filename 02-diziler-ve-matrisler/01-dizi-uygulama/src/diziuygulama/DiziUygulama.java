
package diziuygulama;
import java.util.Scanner;
import java.util.Random;
public class DiziUygulama {

    public static void main(String[] args) {
        
        /*
        Scanner klavye=new Scanner(System.in);
        System.out.print("Boyut degerlerini giriniz = ");
        int satir=klavye.nextInt();
        int sutun=satir;
        System.out.println("matris olusturuluyor...");
        int [][]matris=new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if(i==0 || i==satir-1 || j==0 || j==sutun-1 ||
                        i==j || (i+j)==satir-1){
                    matris[i][j]=1;
                }else{
                    matris[i][j]=0;
                }
                
            }
            
        }
        System.out.println("matris yazdiriliyor....");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j]+" ");
                
            }
             System.out.println("");
        }
       

        int[][]carpimTablosu=new int[10][10];
        System.out.println("Carpim degerleri olusturuluyor");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("  -> 1 - 2 - 3 - 4 - 5 - 6 - 7- 8 - 9 - 10 ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d", (i+1));
            for (int j = 0; j < 10; j++) {
                carpimTablosu[i][j]=(i+1)*(j+1);
                System.out.printf("%3d ",carpimTablosu[i][j]);
                
            }
            System.out.println("");
            
        }
        */
        
        
        /*
        Random rnd=new Random();
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Satir Degerini Giriniz = ");
        if (!klavye.hasNextInt()) {
            System.out.println("Gecersiz satir degeri.");
            return;
        }
        int satir=klavye.nextInt();
        System.out.print("Sutun Degerini Giriniz = ");
        if (!klavye.hasNextInt()) {
            System.out.println("Gecersiz sutun degeri.");
            return;
        }
        int sutun=klavye.nextInt();
        if (satir <= 0 || sutun <= 0 || (long) satir * sutun > 1_000_000) {
            System.out.println("Matris boyutlari pozitif olmali ve toplam hucre sayisi 1000000'i gecmemelidir.");
            return;
        }
        System.out.println("Matris Olusturuluyor!!!!!");
        
        int [][]matris=new int [satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matris[i][j]=rnd.nextInt(10,100);
                System.out.print(matris[i][j]+"  ");
                
            }
            System.out.println("");
        }
        System.out.println("Matris Diziye Aktariliyor..........");
        int []dizi=new int[satir*sutun];
        int index=0;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                dizi[index]=matris[i][j];
                index++;
                
            }
            System.out.println("Dizi Yazdiriliyor......");
            for (int eleman: dizi) {
                System.out.println(eleman + "  ");
                
            }
            System.out.println("");
            System.out.println("Dizi Kucukten Buyuge Siralanir.....");
            int temp;
            for (int i = 0; i < dizi.length; i++) {
                for (int j = 0; j < dizi.length; j++) {
                    if(dizi[i]<dizi[j]){
                        temp=dizi[i];
                        dizi[i]=dizi[j];
                        dizi[j]=temp;
                    }
                    
                }
                
            }
            System.out.println("K'den B'ye SiraliDİzi Yazdiriliyor.....");
            for (int elaman:dizi) {
                System.out.println(elaman + "  ");
                
            }
            System.out.println("");
            System.out.println("Dizi Matrise Donusturuluyor......");
            index=0;
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    matris[i][j]=dizi[index];
                    index++;
                }
                
            }
            System.out.println("K'den B'ye Matris Yazdiriliyor.....");
            for(int i = 0; < satir; i++){
                for (int j = 0; j < 10; j++) {
                    System.out.println(matris[i][j]+"  ");
                    
                }
                System.out.println("");
            }
            
        }
        System.out.println("Dizi B'den K'ya siralaniyor.....");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                
                
            }
            
        }
        */
        
        
        Random rnd=new Random();
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Satir Degerini Giriniz = ");
        int satir=klavye.nextInt();
        System.out.print("Sutun Degerini Giriniz = ");
        int sutun=klavye.nextInt();
        System.out.println("Matris Olusturuluyor!!!!!");
        
        int [][]matris=new int [satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matris[i][j]=rnd.nextInt(10,100);
                System.out.print(matris[i][j]+"  ");
                
            }
            System.out.println("");
        }
        System.out.println("Matrisin Transpozu Hesaplanir.....");
        int [][]transpoz=new int[sutun][satir];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i]=matris[i][j];
            }
        }
        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[i].length; j++) {
                System.out.print(transpoz[i][j] + "  ");
            }
            System.out.println();
        }
        
        
    }
    
}
