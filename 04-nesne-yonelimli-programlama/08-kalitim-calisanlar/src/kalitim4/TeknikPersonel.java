

package kalitim4;

public class TeknikPersonel extends Calisanlar{
    public double gorevlendirmeUcreti;
    TeknikPersonel(String isim,String soyIsim,double gorevlendirmeUcreti){
        super(isim,soyIsim);
        this.gorevlendirmeUcreti=gorevlendirmeUcreti;
    }
}
