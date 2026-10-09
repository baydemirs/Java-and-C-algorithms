
package class3;


public class Dikdortgen {
    public int kisaKenar;
    public int uzunKenar;
    public String rengi;
    public String tipi;
    
    public double alan(int kisaKenar,int uzunKenar){
        return kisaKenar*uzunKenar;
    }
    public double cevre(int kisaKenar,int uzunKenar){
        return 2*(kisaKenar+uzunKenar);
    }
    public double cevre(double kisa,double uzun){
        return 2*(kisa+uzun);
    }
    public double cevre(){
        return 2*(kisaKenar+uzunKenar);
    }
    public void ozellikYazdir(){
        System.out.println("------------------------------------------------------");
        System.out.println("Dikdortgenin Kisakenari : "+kisaKenar);
        System.out.println("Dikdortgenin Uzunkenari : "+uzunKenar);
        System.out.println("Dikdortgenin Rengi : "+rengi);
        System.out.println("Dikdortgenin Tipi : "+tipi);
        System.out.println("Dikdortgenin Alani : "+alan(kisaKenar,uzunKenar));
        System.out.println("Dikdortgenin Cevresi1 : "+cevre());
        System.out.println("Dikdortgenin Cevresi2 : "+cevre(kisaKenar,uzunKenar));
        String deger1=String.valueOf(kisaKenar);
        String deger2=String.valueOf(uzunKenar);
        System.out.println("Dikdortgenin Cevresi3 : " + cevre(Double.parseDouble(deger1), Double.parseDouble(deger2)));
        
    }
}
