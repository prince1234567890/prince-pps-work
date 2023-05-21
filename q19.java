class q19 {
    public static void main(String[] args) {
        int n, a, b, c, sum = 0;
        System.out.print("Armstrong numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            n = i;
            while (n > 0) {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if (sum == i) {
                System.out.println(i + " ");
            }
            sum = 0;
        }
    }
}