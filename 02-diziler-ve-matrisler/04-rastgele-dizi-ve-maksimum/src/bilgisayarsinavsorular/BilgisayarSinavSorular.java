
package bilgisayarsinavsorular;
import java.util.*;
public class BilgisayarSinavSorular {


    public static void main(String[] args) {
     Random rnd = new Random();
        int sayi1 = 6;
        int sayi2 = 100;
        int[] dizi = diziOlustur(sayi1, sayi2);

        int enBuyuk = maxBul(dizi);
        System.out.println("Rastgele olusturulan dizinin en buyuk elemani: " + enBuyuk);
    }

    public static int[] diziOlustur(int sayi1, int sayi2) {
        Random rnd = new Random();
        int[] dizi = new int[6];
        System.out.println("Dizi olusturuluyor....");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(sayi2 - sayi1 + 1) + sayi1;
            System.out.print(dizi[i] + "  ");
        }
        System.out.println("");
        return dizi;
    }

    public static int maxBul(int[] dizi) {
        int enBuyuk = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        return enBuyuk;
    }
}

