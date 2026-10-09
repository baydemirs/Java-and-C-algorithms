
package kalitim1;

public class Kalitim1 {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        Hayvan hayvan1=new Hayvan();
        hayvan1.ad="Hayvanlar Alemi";
        hayvan1.tur="Tum Turler";
        hayvan1.beslenme();
        hayvan1.yasama();
        hayvan1.olme();
        System.out.println("---------------------------------------------------");
        
        System.out.println("---------------------------------------------------");
        Kedi kedi1=new Kedi();
        kedi1.ad="Pamuk"; // fature of super class
        kedi1.tur="Kedigiller"; // fature of super class
        kedi1.renk="Beyaz"; // own fature
        kedi1.cinsi="Scootish"; // own fanction
        kedi1.avlanma(); // own function
        kedi1.beslenme(); // function of super class
        kedi1.yasama(); // function of super class
        kedi1.olme(); // function of super class
        System.out.println("---------------------------------------------------");
        
        System.out.println("---------------------------------------------------");
        Kedi kedi2=new Kedi();
        kedi2.ad="Badem"; // fature of super class
        kedi2.tur="Kedigiller"; // fature of super class
        kedi2.renk="Siyah"; // own fature
        kedi2.cinsi="Tekir"; // own fature
        kedi2.avlanma(); // own function
        kedi1.beslenme(); // function of super class
        kedi2.yasama(); // function of super class
        kedi2.olme(); // function of super class
        System.out.println("---------------------------------------------------");
        
        //System.out.println(hayvan1.ad);
        //System.out.println(kedi1.ad);
        //System.out.println(kedi2.ad);
        System.out.println("---------------------------------------------------");
        Kopek kopek1=new Kopek();
        kopek1.ad="Karabas"; // fature of super class
        kopek1.tur="Kopekgiller"; // fature of super class
        kopek1.renk="Siyah"; //own feature
        kopek1.cinsi="Arjantin Dog";
        kopek1.avlanma(); // own fuction
        kopek1.kesifYap(); // own fuction
        kopek1.yasama(); // function of suoer class
        kopek1.beslenme(); // function of super class
        kopek1.olme(); // function of super class
        System.out.println("---------------------------------------------------");
        
        System.out.println("---------------------------------------------------");
        Surungen S1=new Surungen();
        S1.ad="yilan"; // fature of super class
        S1.tur="Anakondagiller"; // fature of super class
        S1.renk="Siyah"; //own feature
        S1.omurgasiVarmi=true; // own feature
        S1.zararVermeFonksiyobnu(); // own foction
        S1.bolunebilmeYetenegi(); // own foction
        S1.yasama(); // function of super class
        S1.beslenme(); // function of suoer class
        S1.olme(); // function of super class
        System.out.println("---------------------------------------------------");
        
        System.out.println("---------------------------------------------------");
        VahsiKedi v1=new VahsiKedi();
        v1.ad="Jaguar"; // fature of super class
        v1.tur="Kedigiller"; // fature of super class
        v1.renk="Sari Benekli"; //own feature
        v1.cinsi="Yirtici";
        v1.beslenmeTuru="Etcil";
        v1.kamufleOlma();
        v1.kesifYap();
        v1.yasama(); // function of super class
        v1.beslenme(); // function of suoer class
        v1.olme(); // function of super class
        System.out.println("---------------------------------------------------");
    }
    
}
