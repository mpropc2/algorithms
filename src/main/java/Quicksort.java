public class Quicksort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high - 1];
        int separatingPoint = low;

        for (int j = separatingPoint; j < high; j++) {
            if (arr[j] < pivot) {
                Utils.swap(arr, j, separatingPoint);
                separatingPoint++;
            }
        }

        Utils.swap(arr, separatingPoint, high - 1);

        return separatingPoint;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, 0, pivot);
            quickSort(arr, pivot + 1, high);
        }
    }
}
