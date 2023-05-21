import java.util.Scanner;

class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, i, sum = 0;
        System.out.println("enter no.=");
        a = sc.nextInt();
        for (i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println("sum of all no=" + sum);
    }
}