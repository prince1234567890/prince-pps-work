import java.util.Scanner;

class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no.1:");
        int a = sc.nextInt();
        System.out.println("no.2:");
        int b = sc.nextInt();
        System.out.println("no.3:");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c)
                System.out.println("A is greatest");
        } else if (b > a) {
            if (b > c)
                System.out.println("B is greatest");
        } else {
            System.out.println("C is greatest");
        }
    }
}