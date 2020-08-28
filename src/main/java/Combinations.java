public class Combinations {
    public static void findByMethod1(int[] arr, int k, int[] aCombination, int indexOfNextCandidate, int currentIndex) {
        if (indexOfNextCandidate == k) {
            Utils.printArray(aCombination);
            System.out.println();
            return;
        }

        int numOfRemainingElements =  arr.length - currentIndex;
        int numOfRestNumbersInCombination = k - indexOfNextCandidate;
        for (int i = currentIndex; i < arr.length && numOfRemainingElements >= numOfRestNumbersInCombination; i++) {
            aCombination[indexOfNextCandidate] = arr[i];
            findByMethod1(arr, k, aCombination, indexOfNextCandidate + 1, i + 1);
        }
    }

    public static void findByMethod2(int[] arr, int k, int[] aCombination, int indexOfNextCandidate, int currentIndex) {
        if (indexOfNextCandidate == k) {
            Utils.printArray(aCombination);
            System.out.println();
            return;
        }

        if (currentIndex >= arr.length)
            return;

        aCombination[indexOfNextCandidate] = arr[currentIndex];
        findByMethod2(arr, k, aCombination, indexOfNextCandidate + 1, currentIndex + 1);

        findByMethod2(arr, k, aCombination, indexOfNextCandidate, currentIndex + 1);
    }
}
