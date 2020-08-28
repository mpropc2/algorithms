import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Permutations {
    public static void find1(int[] arr, int n) {
        if (n == 1) {
            Utils.printArray(arr);
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            Utils.swap(arr, i, n - 1);
            find1(arr, n - 1);
            Utils.swap(arr, i, n - 1);
        }
    }

    public static List<List<Integer>> find2(int[] arr, int n) {
        List<List<Integer>> permutations = new ArrayList<>();
        if (n == 1) {
            List<Integer> newPermutaion = new ArrayList<>();
            newPermutaion.add(arr[n-1]);
            permutations.add(newPermutaion);
        } else {
            Iterator<List<Integer>> subPermuations = find2(arr, n - 1).iterator();
            while (subPermuations.hasNext()) {
                List<Integer> permutation = subPermuations.next();
                for (int i = 0; i <= permutation.size(); i++) {
                    List<Integer> newpermutation = new ArrayList<>(permutation);
                    newpermutation.add(i, arr[n-1]);
                    permutations.add(newpermutation);
                }
            }
        }

        return permutations;
    }
}
