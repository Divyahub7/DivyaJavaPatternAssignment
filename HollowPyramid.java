public class HollowPyramid {
    public static void pattern8(int n) { // hollow pyramid
        for (int i = 0; i < n; i++) {
            for (int spaces = 0; spaces < n - i - 1; spaces++) {
                System.out.print(" ");
            }
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < 2 * i + 1; j++) {
                    if (j == 0 || j == 2 * i) {
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
        pattern8(n);
    }
}
