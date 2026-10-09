
package class2;

public class Class2 {

    public static void main(String[] args) {
        
        Ucgen ucgen1=new Ucgen();
        ucgen1.taban=10;
        ucgen1.yukseklik=10;
        ucgen1.rengi="Sari";
        ucgen1.tipi="Eskanar Ucgen";
        
        //ucgen1.alan(10, 10);
        //ucgen1.cevre(10);
        ucgen1.ozellikYazdir();
        
        Ucgen ucgen2=new Ucgen();
        ucgen2.taban=22;
        ucgen2.yukseklik=10;
        ucgen2.rengi="Kirmizi";
        ucgen2.tipi="Eskanar Ucgen";
        
        //ucgen1.alan(22, 10);
        //ucgen1.cevre(22);
        ucgen2.ozellikYazdir();
        
        Ucgen ucgen3=new Ucgen();
        ucgen3.taban=33;
        ucgen3.yukseklik=33;
        ucgen3.rengi="Kirmizi";
        ucgen3.tipi="Eskanar Ucgen";
        
        //ucgen1.alan(33, 33);
        //ucgen1.cevre(33);
        ucgen3.ozellikYazdir();
    }
    
}
