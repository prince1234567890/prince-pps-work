import java.util.Scanner;

class q17 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a, sum;
        System.out.print("Enter no.: ");
        a = sc.nextInt();
        for (sum = 0; a != 0; a = a / 10) {
            sum = sum + a % 10;
        }
        System.out.println("Sum : " + sum);
    }
}