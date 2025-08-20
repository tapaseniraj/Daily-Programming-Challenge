import java.util.*;

public class Day6 {

    public static List<int[]> findZeroSum(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Long, List<Integer>> map = new HashMap<>();
        long prefixSum = 0;
        map.put(0L, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (map.containsKey(prefixSum)) {
                for (int start : map.get(prefixSum)) {
                    result.add(new int[]{start + 1, i});
                }
            }
            map.computeIfAbsent(prefixSum, k -> new ArrayList<>()).add(i);
        }
        return result;
    }

    public static void printResult(int[] arr) {
        List<int[]> result = findZeroSum(arr);
        System.out.print("Input: " + Arrays.toString(arr) + "\nOutput: [");
        for (int i = 0; i < result.size(); i++) {
            System.out.print("(" + result.get(i)[0] + ", " + result.get(i)[1] + ")");
            if (i != result.size() - 1) System.out.print(", ");
        }
        System.out.println("]\n");
    }

    public static void main(String[] args) {
        printResult(new int[]{1, 2, -3, 3, -1, 2});

        printResult(new int[]{4, -1, -3, 1, 2, -1});

        printResult(new int[]{1, 2, 3, 4});

        printResult(new int[]{0, 0, 0});

        printResult(new int[]{-3, 1, 2, -3, 4, 0});
    }
}
