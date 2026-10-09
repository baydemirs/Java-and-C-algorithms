
package class1;

public class Class1 {

   
    public static void main(String[] args) {
        Kedi kedi1=new Kedi();
        kedi1.adi="Bidik";
        kedi1.cinsi="Tekir";
        kedi1.cinsiyet="Erkek";
        kedi1.rengi="Beyaz";
        kedi1.yasi=2023;
        
        kedi1.seslendir();
        System.out.println("Yasi : "+kedi1.yasHesapla(2023));
        kedi1.ozellikYazdir();
        
        Kedi kedi2=new Kedi();
        kedi2.adi="Pamuk";
        kedi2.cinsi="Van Kedisi";
        kedi2.cinsiyet="Disi";
        kedi2.rengi="Siyah";
        kedi2.yasi=2018;
        
        kedi2.seslendir();
        kedi2.ozellikYazdir();
    }
    
}
