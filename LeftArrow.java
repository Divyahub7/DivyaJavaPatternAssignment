public class LeftArrow {

    public static void pattern18(int n) { // Left Arrow
        int stars = n;
        int spaces = n - 1;
        for (int i = 0; i < (2 * n) - 1; i++) {
            // spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            if (i < n - 1) {
                stars--;
                spaces--;
            } else {
                stars++;
                spaces++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern18(n);
    }
}
