public class DiamondStarPattern {
    public static void pattern16(int n) { // Diamond Star Pattern
        int stars = 1;
        int spaces = n - 1; // 4
        for (int i = 0; i < (2 * n) - 1; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * stars - 1; k++) {
                System.out.print("*");
            }
            if (i < n - 1) {
                stars++;
                spaces--;
            } else {
                stars--;
                spaces++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern16(n);
    }
}
