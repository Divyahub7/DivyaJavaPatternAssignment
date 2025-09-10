public class XStarPattern {
    public static void pattern11(int n) { // X Star Pattern
        for (int i = 0; i < (2 * n) - 1; i++) {
            for (int j = 0; j < (2 * n) - 1; j++) {
                if (i == j || i == 2 * (n - 1) - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern11(n);
    }
}
