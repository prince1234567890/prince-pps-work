import java.util.Scanner;

class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p, r, t, simple, compound;
        System.out.println("Enter amount:");
        p = sc.nextDouble();
        System.out.println("Enter time:");
        t = sc.nextDouble();
        System.out.println("Enter rate");
        r = sc.nextDouble();
        simple = (p * t * r) / 100;
        compound = p * Math.pow(1.0 + r / 100.0, t) - p;

        System.out.println("simple intrest:" + simple);
        System.out.println("coumpond intrest:" + compound);
    }
}