package soru4;

public class Soru4 {

    public static void main(String[] args) {

        Sekil[] liste = {
            new Dikdortgen(),
            new Ucgen(),
            new Altigen(),
            new Kare(),
            new Daire()
        };
// 1. nesne Dikdortgen 
// 2. nesne Ucgen 
// 3. nesne Altigen 
// 4. nesne Kare
// 5. nesne Daire
// Şekillerin bilgilerini göstermek için
        for (int i = liste.length - 1; i >= 0; i--) {
            liste[i].bilgileriGoster();
        }
    }
}

class Sekil {

    public int kod = 0;
    public static int id = 0;
    public String renk = "Kirmizi";
    public boolean doluMu = false;
    public String geometriTipi = "Sekil";

    public Sekil() {
        id++;
    }

    public void bilgileriGoster() {
        System.out.println(kod + ":" + renk + " " + geometriTipi);
    }
}

class Dikdortgen extends Sekil {

    public Dikdortgen() {
        renk = "Mavi";
        doluMu = true;
        kod = id;
        geometriTipi = "Dikdortgen";
    }
}

class Ucgen extends Sekil {

    public Ucgen() {
        renk = "Pembe";
        doluMu = false;
        kod = id;
        geometriTipi = "Ucgen";
    }
}

class Altigen extends Sekil {

}

class Kare extends Sekil {

    public Kare() {
        renk = "Sari";
        kod = id;
        geometriTipi = "Kare";
    }
}

class Daire extends Sekil {

    public Daire() {
        kod = id;
        geometriTipi = "Daire";
    }
}
