import java.util.Scanner;
import java.util.Random;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static final int TAHTA_BOYUTU = 10;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Tahta tahta = new Tahta();
            
            while (true) {
                // Oyun tahtasını ekrana yazdır
                System.out.println("Oyun Tahtasi:");
                tahta.tahtayiYazdir();
                
                int satir, sutun;
                
                // Kullanıcıdan satır ve sütun koordinatlarını al
                System.out.print("Koordinatlari giriniz (satir, sutun): ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Gecersiz giris. Satir ve sutun tam sayi olmalidir.");
                    scanner.nextLine();
                    continue;
                }
                satir = scanner.nextInt();
                if (!scanner.hasNextInt()) {
                    System.out.println("Gecersiz giris. Satir ve sutun tam sayi olmalidir.");
                    scanner.nextLine();
                    continue;
                }
                sutun = scanner.nextInt();
                
                // Oyunu sonlandırma koşulu
                if (satir == 0 && sutun == 0) {
                    System.out.println("Oyun sonlandirildi. Iyi gunler!");
                    break;
                }
                
                // Kullanıcı girişini dizin indislerine dönüştür
                --satir;
                --sutun;
                
                // Geçerli koordinat kontrolü
                if (!tahta.sınırlarIcindeMi(satir, sutun)) {
                    System.out.println("Gecersiz koordinatlar. Lutfen tekrar deneyin.");
                    continue;
                }
                
                // Seçilen rengi belirle
                char secilenRenk = tahta.tahta[satir][sutun];
                
                // Grubu bul ve değiştir
                if (tahta.grupBulVeDegistir(satir, sutun, secilenRenk)) {
                    System.out.println("Belirtilen renk ve kurallara uygun grup 'x' ile degistirildi.");
                } else {
                    System.out.println("Bu hucre daha once isaretlenmis.");
                }
            }
        }
    }

    public static class Candy {
        int renk;

        Candy(Random rand) {
            renk = rand.nextInt(10); // Renk, 0 ile 9 arasında rastgele bir sayı olarak atanır
        }
    }

    public static class Tahta {
        char[][] tahta = new char[TAHTA_BOYUTU][TAHTA_BOYUTU];

        public Tahta() {
            Random rand = new Random();
            // Oyun tahtasını oluştur
            for (int i = 0; i < TAHTA_BOYUTU; ++i) {
                for (int j = 0; j < TAHTA_BOYUTU; ++j) {
                    tahta[i][j] = Character.forDigit(new Candy(rand).renk, 10);
                }
            }
        }

        // Oyun tahtasını ekrana yazdır
        public void tahtayiYazdir() {
            for (int i = 0; i < TAHTA_BOYUTU; ++i) {
                for (int j = 0; j < TAHTA_BOYUTU; ++j) {
                    System.out.print(tahta[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Verilen koordinatların oyun tahtasının sınırları içinde olup olmadığını kontrol et
        public boolean sınırlarIcindeMi(int satir, int sutun) {
            return satir >= 0 && satir < TAHTA_BOYUTU && sutun >= 0 && sutun < TAHTA_BOYUTU;
        }

        // Yataydaki şekerleri değiştir
        public void yanYanaCandyDegistir(int x, int y, char hedefRenk, char yeniRenk) {
            if (hedefRenk == yeniRenk || !sınırlarIcindeMi(x, y) || tahta[x][y] != hedefRenk) {
                return;
            }

            Deque<int[]> bekleyenler = new ArrayDeque<>();
            bekleyenler.push(new int[]{x, y});

            while (!bekleyenler.isEmpty()) {
                int[] konum = bekleyenler.pop();
                int satir = konum[0];
                int sutun = konum[1];
                if (!sınırlarIcindeMi(satir, sutun) || tahta[satir][sutun] != hedefRenk) {
                    continue;
                }

                tahta[satir][sutun] = yeniRenk;
                bekleyenler.push(new int[]{satir - 1, sutun});
                bekleyenler.push(new int[]{satir + 1, sutun});
                bekleyenler.push(new int[]{satir, sutun - 1});
                bekleyenler.push(new int[]{satir, sutun + 1});
            }
        }

        // Grubu bul ve değiştir
        public boolean grupBulVeDegistir(int satir, int sutun, char hedefRenk) {
            char yeniRenk = 'x';
            if (!sınırlarIcindeMi(satir, sutun) || hedefRenk == yeniRenk
                    || tahta[satir][sutun] != hedefRenk) {
                return false;
            }

            yanYanaCandyDegistir(satir, sutun, hedefRenk, yeniRenk);

            return true;
        }
    }
}
