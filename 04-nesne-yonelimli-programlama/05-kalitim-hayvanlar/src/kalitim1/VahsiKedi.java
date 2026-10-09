
package kalitim1;

public class VahsiKedi extends Kedi {
    public String beslenmeTuru;
    
    public void kesifYap(){
        System.out.println(tur + " den " + renk + " renkli " + cinsi + " cinsi "+beslenmeTuru + " beslenme turune sahip " + ad + " adli vahsi kedi kesif yapar");
    }
    public void kamufleOlma(){
        System.out.println(tur + " den " + renk + " renkli " + cinsi + " cinsi "+beslenmeTuru + " beslenme turune sahip " + ad + " adli vahsi kedi kamufle olur");
    }
}
