public class NumericPyramids {
    public static void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            // numbers
            for (int u = 0; u <= i; u++) {
                System.out.print(u + 1);
            }
            // space
            for (int space = 0; space < 2 * (n - i - 1); space++) {
                System.out.print(" ");
            }
            // numbers
            for (int l = i; l >= 0; l--) {
                System.out.print(l + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern13(n);
    }
}
