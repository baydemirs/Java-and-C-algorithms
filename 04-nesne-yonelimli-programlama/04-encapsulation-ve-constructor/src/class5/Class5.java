
package class5;
public class Class5 {

    public static void main(String[] args) {
        /*
        Kitap kitap1=new Kitap();
        kitap1.ozellikYazdir();
        //kitap1.ciltNoGüncelle(1023456);
        System.out.println("-------------------------------------------------------------------------");
        Kitap kitap2=new Kitap();
        kitap2.parametreAktar(1234567890, "Emirhan Aydemir", "Kumar", "2005", 234, "Papatya", 59.99, 5);
        kitap2.ozellikYazdir();

        Kitap kitap3=new Kitap();
        //kitap3.ozellikYazdir();
        
        Kitap kitap4=new Kitap(1234567890, "Emirhan Aydemir", "Kumar", "2005", 234, "Papatya", 59.99, 5);
       
        Kitap kitap5=new Kitap("Emirhan Aydemir","omerin intikami", "2023" , "papatya", 59.99, 5);
         */
        Kitap kitap6=new Kitap();
        kitap6.setISBN(1234567890);
        kitap6.setAd("Gokhanin Gozyaslari");
        kitap6.setBasimYili("2022");
        kitap6.setCiltNo(1);
        kitap6.setFiyat(299.99);
        kitap6.setSayfaSayisi(1453);
        kitap6.setYayinEvi("Bayburt Yayin Ev");
        kitap6.setYazar("Gokhan Yilmaz");
        kitap6.ozellikYazdir();
        
        System.out.println("Guncel Fiyat : "+ kitap6.getFiyat());
    }
    
}
