
package kalitim1;

public class Surungen extends Hayvan {
    public String renk;
    public boolean omurgasiVarmi;
    
    public void zararVermeFonksiyobnu(){
        if (omurgasiVarmi){
             System.out.println(tur + " den " + renk + " renkli " + ad + " adli surungen zarar verebilir ");
        }else{
             System.out.println(tur + " den " + renk + " renkli " + ad + " adli surungen zarar zararsizdir ");
        }
    }
    public void bolunebilmeYetenegi(){
        if (omurgasiVarmi){
             System.out.println(tur + " den " + renk + " renkli " + ad + " adli surungen bolunemez ");
        }else{
             System.out.println(tur + " den " + renk + " renkli " + ad + " adli surungen bolunebilir ");
        }
    }
}
