package Union_Intersection;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionMultipleArray {
    public static void main(String[] args) {

        int[][] multipleArray = {
            {1, 5, 10, 20, 40, 80},
            {6, 7, 20, 80, 100},
            {3, 4, 15, 20, 30, 70, 80, 120},
        };

        List<Integer> result = commonElement(multipleArray);

        System.out.println("\n result: " + result);
    }

    public static List<Integer> commonElement(int[][] arr) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int n = arr.length;

        for (int[] insideArr : arr) {
            
            // Use a temporary HashSet to avoid duplicates within the same array

            HashSet<Integer> uniqueElement = new HashSet<>();

            for (int num : insideArr) {
                uniqueElement.add(num);
            }

            // Update the frequency map for unique elements

            for (int num : uniqueElement) {
                frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            }
        }

        // Collect elements present in all arrays

        List<Integer> result = new ArrayList<>();
        for (int num : frequency.keySet()) {
            if (frequency.get(num) == n) {
                result.add(num);
            }
        }

        return result;
    }
}
