import java.util.Scanner;

class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int a = sc.nextInt();
        if (a%4==0 || a%400==0 && a%100!=0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}