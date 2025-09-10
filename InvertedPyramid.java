public class InvertedPyramid {
    public static void pattern7(int n) { // inverted pyramid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - 1 - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern7(n);
    }
}
