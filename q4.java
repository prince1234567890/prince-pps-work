import java.util.Scanner;

class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, f;
        System.out.println("Enter temp in c:");
        c = sc.nextDouble();
        f = (9 * c) / 5 + 32;
        System.out.println("Fahrenheit:" + f);

    }
}