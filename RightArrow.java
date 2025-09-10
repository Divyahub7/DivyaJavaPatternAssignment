public class RightArrow {
    public static void pattern17(int n) { // Right Arrow
        int stars = n;
        int spaces = 0;
        for (int i = 0; i < (2 * n) - 1; i++) {
            // spaces
            for (int j = 0; j < 2 * spaces; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            if (i < n - 1) {
                stars--;
                spaces++;
            } else {
                stars++;
                spaces--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern17(n);
    }
}
