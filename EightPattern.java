public class EightPattern {
    public static void pattern19(int n) {
        int mid = (n - 1);
        int last = (2 * n) - 2;
        for (int i = 0; i < (2 * n) - 1; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0 && j != (n - 1))
                        || (i != 0 && i != last && j == 0 && i != mid)
                        || (i != 0 && i != last && j == n - 1 && i != mid)
                        || (i == mid && j != 0 && j != (n - 1)) || (i == last && j != 0 && j != (n - 1))) {
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
        pattern19(n);
    }
}
