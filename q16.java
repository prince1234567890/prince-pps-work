import java.util.Scanner;

class q16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, i, b = 0, flag = 0;
        System.out.println("enter no.=");
        a = sc.nextInt();
        b = a / 2;
        if (a == 0 || a == 1) {
            System.out.println(a + "not a prime no.");
        } else {
            for (i = 2; i <= b; i++) {
                if (a % i == 0) {
                    System.out.println(a + "not a prime no.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(a + " is prime no.");
            }
        }
    }
}