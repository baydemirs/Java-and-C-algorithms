
package kalitim4;

public class Tekniker extends TeknikPersonel{
    public double mesai;
    public Tekniker(String isim,String soyIsim,double gorevlendirmeUcreti,double mesai){
        super(isim,soyIsim,gorevlendirmeUcreti);
        this.mesai=mesai;
    }
    double mesaiUcretiHesapla(){
        return mesai;
    }
}
