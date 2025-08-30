public class Day16 {

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        long n = 4;
        long m = 6;

        System.out.println("Input: N = " + n + ", M = " + m);
        System.out.println("Output: " + lcm(n, m));

        n = 5;
        m = 10;
        System.out.println("Input: N = " + n + ", M = " + m);
        System.out.println("Output: " + lcm(n, m));

        n = 7;
        m = 3;
        System.out.println("Input: N = " + n + ", M = " + m);
        System.out.println("Output: " + lcm(n, m));

        n = 1;
        m = 987654321;
        System.out.println("Input: N = " + n + ", M = " + m);
        System.out.println("Output: " + lcm(n, m));

        n = 123456;
        m = 789012;
        System.out.println("Input: N = " + n + ", M = " + m);
        System.out.println("Output: " + lcm(n, m));
    }
}
