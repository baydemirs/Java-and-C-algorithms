
package ikinciderecedendenklem;
import java.util.Scanner;
public class IkinciDerecedenDenklem {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("2.derece denklem cozme uygulamasina hos geldiniz");
        System.out.println("Cozumleyecegimiz denklem:" + "a*x^2+b*x+c=0");
        System.out.println("a,b,c kat sayi");
        System.out.println("Sistem a,b,c kat sayilarini gir : ");
        if (!klavye.hasNextDouble()) {
            System.out.println("Gecersiz a katsayisi.");
            return;
        }
        double a = klavye.nextDouble();
        if (!klavye.hasNextDouble()) {
            System.out.println("Gecersiz b katsayisi.");
            return;
        }
        double b = klavye.nextDouble();
        if (!klavye.hasNextDouble()) {
            System.out.println("Gecersiz c katsayisi.");
            return;
        }
        double c = klavye.nextDouble();
        if (!Double.isFinite(a) || !Double.isFinite(b) || !Double.isFinite(c)) {
            System.out.println("Katsayilar sonlu sayilar olmalidir.");
            return;
        }
        if (a == 0) {
            System.out.println("a katsayisi 0 olamaz; bu denklem ikinci dereceden degildir.");
            return;
        }
        double Diskriminant = b * b - 4 * a * c;
        System.out.println("Sistemin diskirimant degeri : " + Diskriminant);
        
        if ( Diskriminant> 0) {
            double x1 = (-b - Math.sqrt(Diskriminant)) / (2 * a);
            double x2 = (-b + Math.sqrt(Diskriminant)) / (2 * a);
            System.out.println("Sistemin kokleri : " + x1 + ", " + x2);
               double toplam=x1+x2;
               double carpim=x1*x2;
               System.out.println("Sistemin kokler toplami : " + toplam);
            System.out.println("Sistemin kokler carpimi : " + carpim);
        }


        else if (Diskriminant==0) {
          double kok=-b / (2 * a);
          System.out.println("Denklem tam kare ifade eder cakisik koke sahiptir"+kok);
          double top=2*kok;
          double carp=kok*kok;
          System.out.println("Sistemin kokler toplami : "+top);
          System.out.println("Sistemin kokler carpimi : "+carp);
        }


        else if (Diskriminant<0) {
            System.out.println("Sistemin reel koku yoktur");
            System.out.println("Sistemin kokler toplami : "+-1*b/a);
            System.out.println("Sistemin kokler carpimi : "+c/a);
        }
        
    }
    
}
