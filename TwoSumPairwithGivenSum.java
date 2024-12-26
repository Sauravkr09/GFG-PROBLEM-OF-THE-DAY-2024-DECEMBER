import java.util.HashSet;
import java.util.Set;

public class TwoSumPairWithGivenSum {
    
    // Method to find if a pair exists with the given sum
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 16;

        boolean result = hasPairWithSum(arr, target);
        System.out.println("Pair with given sum exists: " + result);
    }
}
