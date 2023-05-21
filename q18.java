import java.util.Scanner;

class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, rev = 0, temp;
        System.out.println("Enter no.:");
        a = sc.nextInt();
        for (; a != 0; a = a / 10) {
            temp = a % 10;
            rev = rev * 10 + temp;
        }
        System.out.println("Reverse is: " + rev);
    }
}

