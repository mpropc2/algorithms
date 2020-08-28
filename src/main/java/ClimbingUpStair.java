public class ClimbingUpStair {
    private static int total = 0;

    public static void findPossibleWays(int n) {
        if (n == 0) {
            total++;
        }

        if (n == 1) {
            findPossibleWays(n - 1);
        }

        if (n > 1) {
            findPossibleWays(n - 1);
            findPossibleWays(n - 2);
        }
    }

    public static int findPossibleWays_DP(int n) {
        if (n == 1) return 1;
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 2;

        for (int i = 2; i < n; i++) {
            result[i] = result[i-1] + result[i-2];
        }

        return result[n - 1];
    }

    public static int getTotal() {
        return total;
    }
}
