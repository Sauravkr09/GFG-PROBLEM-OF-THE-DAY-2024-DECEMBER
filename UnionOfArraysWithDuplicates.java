import java.util.HashSet;

public class UnionOfArraysWithDuplicates {
    public static int findUnion(int a[], int b[]) {
        // Use a HashSet to store distinct elements
        HashSet<Integer> set = new HashSet<>();
        
        // Add all elements of array a to the set
        for (int num : a) {
            set.add(num);
        }
        
        // Add all elements of array b to the set
        for (int num : b) {
            set.add(num);
        }
        
        // The size of the set gives the count of unique elements in the union
        return set.size();
    }

    public static void main(String[] args) {
        // Example inputs
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};
        
        // Output the result
        System.out.println("The number of distinct elements in the union is: " + findUnion(a, b));
    }
}
