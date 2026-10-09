
package orneksoru;

public class OrnekSoru {

    public static void main(String[] args) {
        /*
        String yazi ="Istanbul Ankara";
        int a=121,b=11;
        System.out.println("a*b(1):"+a*b++);
        System.out.print("a*b(3):");
        System.out.println(a*b);
        b=-a++;
        System.out.printf("a-b(4):00%8d\n",b*((a+b)*2));
        System.out.println("yazi(5):"+yazi.substring(5, 13));
        */
        
        
        String s1="YAPAY", s2="ZEKA";
        char c1=s1.charAt(2);
        int d1=(int)s2.charAt(2),d2=(int)s1.charAt(4);
        System.out.printf(":%8s%-8s:\n",s1,s2);
        System.out.println(s2 + "-->" + d2);
        d2--; c1++; d2++; c1++;
        System.out.print("("+s2+">"+s1+")"+(char)d2);
        System.out.println((char)d1 + "::" + ++c1);
        c1++; c1++;
        System.out.printf("%c%c-->",--c1,c1);
        System.out.printf("<--%s","CodeWarrior");
    }
    
}
