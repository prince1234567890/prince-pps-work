import java.util.Scanner;

class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, i, o = 0, t = 1, th;
        System.out.println("enter no.=");
        a = sc.nextInt();
        for (i = 1; i <= a; ++i) {
            System.out.print(o + ", ");
            th = o + t;
            o = t;
            t = th;
        }
        System.out.println("Fibonacci Series to" + a + "terms");

    }
}