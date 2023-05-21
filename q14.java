import java.util.Scanner;

class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, i, o = 0, e = 0;
        System.out.println("enter no.=");
        a = sc.nextInt();
        for (i = 1; i <= a; i++) {
            if (i % 2 == 0)
                e = e + i;
            else
                o = o + i;
        }
        System.out.println("odd no. sum is= " + o);
        System.out.println("even no. sum is= " + e);
    }
}