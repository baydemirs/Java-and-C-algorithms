public class Main {
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("EBOB(84, 30) = " + gcd(84, 30));
    }

    static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n, 0 ile 20 arasinda olmalidir.");
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

