
package kalitim3;

public class TarimKredisi extends KrediTurleri {
    String kullanilacakAlan;
    
    TarimKredisi(double faizOrani,double krediTutari,int vadeSayisi){
        super(faizOrani);
        this.krediTutari=krediTutari;
        this.vadeSayisi=vadeSayisi;
    }
}
