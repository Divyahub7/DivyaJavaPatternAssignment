public class HollowDiamond {

    public static void pattern10(int n) { // Hollow Diamond
        // UPPER PORTION
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            // space
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }
            // stars
            for (int l = 0; l < (n - i); l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // LOWER PORTION
        for (int m = 0; m < n; m++) {
            // stars
            for (int p = 0; p <= m; p++) {
                System.out.print("*");
            }
            // spaces
            for (int q = 0; q < 2 * (n - m - 1); q++) {
                System.out.print(" ");
            }
            // stars
            for (int r = 0; r <= m; r++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern10(n);
    }
}
