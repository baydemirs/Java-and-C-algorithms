
package ornek3;
import java.util.Scanner;
public class Ornek3 {

    public static void main(String[] args) {
        
        /*
        
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Lutfen Ay Numarasini Giriniz = ");
        int ay=klavye.nextInt();
        
        switch (ay){
            case 1:
            System.out.println(ay+" . ay : Ocak");
            break;
            case 2:
            System.out.println(ay+" . ay : Subat");
            break;
            case 3:
            System.out.println(ay+" . ay : Mart");
            break;
            case 4:
            System.out.println(ay+" . ay : Nisan");
            break;
            case 5:
            System.out.println(ay+" . ay : Mayis");
            break;
            case 6:
            System.out.println(ay+" . ay : Haziran");
            break;
            case 7:
            System.out.println(ay+" . ay : Temmuz");
            break;
            case 8:
            System.out.println(ay+" . ay : Agustos");
            break;
            case 9:
            System.out.println(ay+" . ay : Eylul");
            break;
            case 10:
            System.out.println(ay+" . ay : Ekim");
            break;
            case 11:
            System.out.println(ay+" . ay : Kasim");
            break;
            case 12:
            System.out.println(ay+" . ay : Aralik");
            break;
            default:
                System.out.println("Miladi Takvim'de "+ay+" .Ay Yoktur ");
                break;     
    }
        
            */
        
        
        /*
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Haftanin Günelrinden Birini Giriniz = ");
        String gun=klavye.nextLine();
        
        switch (gun){
                case "Pazartesi":
                System.out.println(gun+ "Haftanin Ilk Gunudur");
                break;
        
                 case "Sali":
                System.out.println(gun + "Haftanin Ikinci Gunudur");
                break;
        
                 case "Carsamba":
                System.out.println(gun+ "Haftanin Ucuncu Gunudur");
                break;
        
                 case "Persembe":
                System.out.println(gun+ "Haftanin Dorduncu Gunudur");
                break;
        
                 case "Cuma":
                System.out.println(gun+ "Haftanin Besinci Gunudur");
                break;
        
                 case "Cumartesi":
                System.out.println(gun+ "Haftanin Altinci Gunudur");
                break;
        
                 case "Pazar":
                System.out.println(gun+ "Haftanin Yedinci Gunudur");
                break;
        
                 default:
                     System.out.println(gun+"Haftanin Gunu DEGILDİR!");
                     break;
            
        }
           */
        
        /*
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Birinci Sayiyi Giriniz : ");
        int sayi1=klavye.nextInt();
        
        System.out.print("Ikinci Sayiyi Giriniz : ");
        int sayi2=klavye.nextInt();
        
        System.out.print(" '+', '-', '*', '/' Islemlerinden Birini Seciniz : ");
        char oparetor=klavye.next().charAt(0);
        
        switch(oparetor){
                case '+':
                System.out.println(sayi1 + "+" + sayi2 + " : "+ (sayi1+sayi2));
                break;
                
                case '-':
                System.out.println(sayi1 + "-" + sayi2 + " : "+ (sayi1-sayi2));
                break;
                
                case '*':
                System.out.println(sayi1 + "*" + sayi2 + " : "+ (sayi1*sayi2));
                break;
                
                case '/':
                System.out.println(sayi1 + "/" + sayi2 + " : "+ (sayi1/sayi2));
                break;
                default:
                }
        */
        
        
        /*
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("N degerini girin : ");
        int n=klavye.nextInt();
        
        for (int i = 0; i < n; i++) {
            //bady of j=for
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n ; k++) {
                    //bady of k=for
                     System.out.println("FOR LOOP LOADING....");
                    
                }
               
                
            }
            
        }
        
        */
        
        
        /*
        int ciftTop=0,tekTop=0;
        for (int i = 0; i <= 100; i++) {
            if (i%2==0){
                ciftTop+=i;
            }else{
                tekTop+=i;
            }
            
        }
        System.out.println("0-100 Arasindaki Cift Sayilarin Toplami = "+ciftTop);
        System.out.println("0-100 Arasindaki Tek Sayilarin Toplami = "+tekTop);

        */
        
        
        /*
        // wihile loop
        int i=0;
        while(i<100){
        // bady of wihile
        System.out.println((i+1)+". Wihile Loop Loading");
        i++;
    }
        */
        
        
        /*
        int tekSay=0,ciftSay=0;
        int i=0;
        while(i<=100){
            if (i%2==0){
                ciftSay++;
            }else{
                tekSay++;
            }
            i++;
        }
        System.out.println("Tek Adet = "+tekSay);
        System.out.println("Cift Adet = "+ciftSay);
        */
        
        /*
        int i=0;
        do {
            i++;
            System.out.println((i)+". Do=While Loading");
        } while (i<100);
        */
        
        
        /*
        Scanner klavye=new Scanner(System.in);
        int i;
        do {
            System.out.print("Pozitif Bir Sayi Giriniz = ");
            i=klavye.nextInt();
        } while (i<0);
        */
    }
    
}
