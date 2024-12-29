import java.util.*;

class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        HashMap<Integer, Integer> freqMapA = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        // Count frequencies of elements in array 'a'
        for (int num : a) {
            freqMapA.put(num, freqMapA.getOrDefault(num, 0) + 1);
        }
        
        // Iterate over array 'b' and check for intersection
        for (int num : b) {
            if (freqMapA.getOrDefault(num, 0) > 0) {
                result.add(num);
                freqMapA.put(num, freqMapA.get(num) - 1);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        // Input for array 'a'
        System.out.println("Enter the size of array a:");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array a:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Input for array 'b'
        System.out.println("Enter the size of array b:");
        int m = scanner.nextInt();
        int[] b = new int[m];
        System.out.println("Enter elements of array b:");
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        
        // Get the intersection and print the result
        ArrayList<Integer> result = solution.intersectionWithDuplicates(a, b);
        System.out.println("Intersection with duplicates: " + result);
        
        scanner.close();
    }
}
