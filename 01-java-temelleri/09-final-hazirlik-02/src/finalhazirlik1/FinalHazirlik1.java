
package finalhazirlik1;
import java.util.Scanner;
import java.util.Random;
public class FinalHazirlik1 {

    public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
       Random rnd=new Random();
       
       /*
       // ogrenciler dizisi olusturuluyor
       int []ogrenciler=new int[300];
       // ogrenci numaraları ile dizi olusturuluyor
       int no=2023100;
        for (int i = 0; i < ogrenciler.length; i++) {
            ogrenciler[i]=no+i;
        }
        // ogrenciler dizisi yazdiriliyor
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println((i+1)+". "+ogrenciler[i]);
        }
        // secilecek ogrenci sayisi kullanicidan aliniyor
        System.out.print("Sayi girin : ");
        int n=klavye.nextInt();
        int []liste=new int[n];
        for (int i = 0; i < liste.length; i++) {
            int rasgele=rnd.nextInt(300);
            if(i==0){
                liste[i]=2023100+rasgele;
            }else{
                for (int j = 0; j < i; j++) {
                    if(liste[j]==no+rasgele){
                        i--;
                        break;
                    }else{
                        liste[i]=no+rasgele;
                    }
                }
            }
        }
        // secilen ogrenciler gosteriliyor
        for (int i = 0; i < liste.length; i++) {
            System.out.println((i+1)+"."+"ogrenci : "+liste[i]);
            
        }

        */
       
       /* 
       double [][]a={{1,2,3,4,5},{50,30,20,40,10},{170,240,320,430,550}};
       double [][]b={{10,20},{30,40},{50,60},{70,80},{90,100}};
       double [][]c=new double[a.length][b[0].length];
       // double [][]c=new double[3][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j]=0;
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.printf("%10.1f",c[i][j]);
            }
            System.out.println();
            
        }
        */
       
       
    }
    
}
