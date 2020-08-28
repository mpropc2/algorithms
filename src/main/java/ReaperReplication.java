public class ReaperReplication {
    public static int evaluateReaperPopulation(int n) {
        int numberOfReapers = 1;
        if (n <= 4) {
            return 1;
        }

        n -= 4;
        int replicationDays = 0;
        if (n % 4 == 0) {
            replicationDays = 4;
        } else {
            replicationDays = n % 4;
        }
        for (int i = 0; i < replicationDays; i++) {
            numberOfReapers += evaluateReaperPopulation(n - i);
        }

        return numberOfReapers;
    }

}
