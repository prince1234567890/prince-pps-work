import java.util.Scanner;

class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, i, fact = 1;
        System.out.println("enter no.=");
        a = sc.nextInt();
        for (i = 1; i <= a; ++i) {
            fact *= i;
        }

        System.out.println("factorial of   " + a + "  is  " + fact);
    }
}