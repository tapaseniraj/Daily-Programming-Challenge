import java.util.*;

public class Day5 {
    public static List<Integer> findLeader(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        System.out.println(findLeader(arr1));

        int[] arr2 = {1, 2, 3, 4, 0};
        System.out.println(findLeader(arr2));

        int[] arr3 = {7, 10, 4, 10, 6, 5, 2};
        System.out.println(findLeader(arr3));

        int[] arr4 = {5};
        System.out.println(findLeader(arr4));

        int[] arr5 = {100, 50, 20, 10};
        System.out.println(findLeader(arr5));

        int n = 1000000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        List<Integer> result = findLeader(arr);
        System.out.println(result);
    }
}
