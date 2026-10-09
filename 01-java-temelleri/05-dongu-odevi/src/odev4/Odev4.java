
package odev4;
import java.util.Scanner;
public class Odev4 {
    public static void main(String[] args) {
        try (Scanner klavye = new Scanner(System.in)) {
            System.out.print("N Degerini Giriniz : ");
            if (!klavye.hasNextInt()) {
                System.out.println("Gecersiz giris. Tam sayi giriniz.");
                return;
            }

            int n = klavye.nextInt();
            if (n < 1 || n > 100_000) {
                System.out.println("N degeri 1 ile 100000 arasinda olmalidir.");
                return;
            }

            for (int i = 1; i < n; i++) {
                System.out.println("Dongulere Hazirlaniyorum");
            }
        }
    }
}
