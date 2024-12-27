import java.util.*;

public class CountPairsWithGivenSum {
    public int countPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            count += map.getOrDefault(target - num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        CountPairsWithGivenSum solution = new CountPairsWithGivenSum();
        int[] arr = {1, 5, 7, 1};
        int target = 6;
        System.out.println("Count of pairs: " + solution.countPairs(arr, target));
    }
}
