package soru3;

public class Soru3 {

    static int num = 1000;

    public static void main(String[] args) {

        A a = new A();
        C c = new C(num);
        c.p(8);

        /*
a.a(5);
a.a(5.5);
b.b(2);
b.b(5);
b.b(5.5);
c.c(5);
c.c(5.5);
b.a(5);
         */
    }
}

class C {

    static int number = 10;

    public C() {
        System.out.println("sonuc8:" + 7 * 22.5);
    }

    public C(int number) {
        System.out.println("sonuc1:" + number * 22.5);
    }

    public void p() {
        System.out.println("sonuc7:" + number * 22.5);
    }

    public void p(int number) {
        System.out.println("sonuc2:" + number * 12.75);
    }
}

class B extends C {

    public B() {
        System.out.println("sonuc4:" + 13 * 2.5);
    }

    public void p(double deger) {
        System.out.println("sonuc3:" + deger * 1.5);
    }

    public void p(int sayi) {
        System.out.println("sonuc4:" + sayi * 2);
    }
}

class A extends B {

    public A() {
        System.out.println("Sonuc9:" + 3 * 10.5);
    }

    public void p(int number) {
        System.out.println("Sonuc5:" + number + 10);
    }

    public void p(double num) {
        System.out.println("Sonuc6:" + num);
    }
}


/*
package soru3;

public class Soru3 {


static int num = 1000;
public static void main(String[] args) {
A a = new A();
System.out.println(A.topla(5));

}
}
class A  {
public A() {
    System.out.println("Sonuc9:"+ 3 * 10.5);
}
public static int topla(int num){

    
    return num*num;
}


}*/
