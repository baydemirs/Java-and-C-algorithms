
package class1;


public class Kedi {
    
    public String adi;
    public String rengi;
    public int yasi;
    public String cinsi;
    public String cinsiyet;
    
    public void seslendir(){
        System.out.println("Miyav Miyav");
    }
    public int yasHesapla(int yil){
        return 2024-yil;
    }
    public void ozellikYazdir(){
        System.out.println("Kedinin yasi ="+yasi);
        System.out.println("Kedinin Adi ="+adi);
        System.out.println("Kedinin Rengi ="+rengi);
        System.out.println("Kedinin Yasi ="+yasHesapla(yasi));
        System.out.println("Kedinin Cinsi ="+cinsi);
        System.out.println("Kedinin Cinsiyeti ="+cinsiyet);
    }
}
  
