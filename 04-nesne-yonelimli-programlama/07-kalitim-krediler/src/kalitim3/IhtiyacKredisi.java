
package kalitim3;

public class IhtiyacKredisi extends KrediTurleri {
    String durum;
    
    IhtiyacKredisi(double faizOrani,double krediTutari,int vadeSayisi){
        super(faizOrani);
        this.krediTutari=krediTutari;
        this.vadeSayisi=vadeSayisi;
    }
}
