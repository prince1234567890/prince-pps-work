import java.util.Scanner;

class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Five Subject Marks :");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int t = m1 + m2 + m3 + m4 + m5;
        float p = t / 5;
        System.out.println("Total :" + t);
        System.out.println("Percentage :" + p);
        if (p >= 90) {
            System.out.println("A");
        } else if (p >= 80 && p <= 90) {
            System.out.println("B");
        } else if (p >= 60 && p <= 80) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}