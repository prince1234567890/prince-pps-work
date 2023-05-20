import java.util.Scanner;

class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, a, c;
        System.out.println("Enter Radius:");
        r = sc.nextDouble();
        a = 3.14 * r * r;
        c = 2 * 3.14 * r;
        System.out.println("area of circle:" + a);
        System.out.println("circumference of circle:" + c);
    }
}