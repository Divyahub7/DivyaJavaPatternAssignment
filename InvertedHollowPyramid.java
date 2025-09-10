public class InvertedHollowPyramid {
    public static void pattern9(int n) { // inverted hollow pyramid
        for (int i = 0; i < n; i++) {
            for (int spaces = 0; spaces < i; spaces++) {
                System.out.print(" ");
            }
            if (i == 0 || i == n - 1) {
                for (int k = 0; k < 2 * (n - 1 - i) + 1; k++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < 2 * (n - 1 - i) + 1; j++) {
                    if (j == 0 || j == 2 * (n - 1 - i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern9(n);
    }
}
