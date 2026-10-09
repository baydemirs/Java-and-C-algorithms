
package class2;

public class Ucgen {
    
    public int taban;
    public int yukseklik;
    public String rengi;
    public String tipi;
    
    public double alan(int taban,int yukseklik){
        return (taban*yukseklik)/2.0;
    }
    
    public double cevre(int taban){
    return 3*taban ;
    
    }
    public void ozellikYazdir(){
        System.out.println("-------------------------------------------");
        System.out.println("Ucgenin Tabani : "+taban);  
        System.out.println("Ucgenin Yuksekligi : "+yukseklik);
        System.out.println("Ucgenin Rengi : "+rengi);
        System.out.println("Ucgenin Tipi : "+tipi);
        System.out.println("Ucgenin Alani : "+alan(taban,yukseklik));
        System.out.println("Ucgenin Tabani : "+cevre(taban));
    }
    
}
