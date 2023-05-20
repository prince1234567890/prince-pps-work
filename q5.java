import java.util.Scanner;

class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        System.out.println("no.1=");
        a = sc.nextInt();
        System.out.println("no.2");
        b = sc.nextInt();
        System.out.println("before swap:" + a + ", "+b ) ;  
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swap:" + a + ", " + b);
    }
}