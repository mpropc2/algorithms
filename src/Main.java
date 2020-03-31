import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,0,0,-1,1,2,1};
        int[] arr1 = {2,5,2,7,3,4};
        Utils.printArray(arr);
        int result = SubArraySum.subarraySum(arr, 3);
        System.out.println("result: " + result);
    }

}
