
package kalitim3;

public class Kalitim3 {


    public static void main(String[] args) {
        KrediTurleri kt1=new KrediTurleri(0.2);
        kt1.krediTuru="Kredi";
        kt1.krediTutari=100000;
        kt1.vadeSayisi=12;
        kt1.verilenKredi="Kredi Pesin";
        kt1.krediBilgileriniGöster();
        System.out.println("-------------------------------------------------");
        
        IhtiyacKredisi ih1=new IhtiyacKredisi(0.69,300000,24);
        ih1.durum="olumlu";
        ih1.krediTuru="Yaz Speti";
        ih1.verilenKredi="Kredi Pesin";
        ih1.vadeSayisi=24;
        ih1.krediBilgileriniGöster();
    }
    
}
