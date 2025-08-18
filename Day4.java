import java.util.Arrays;

public class Day4 {
    public static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;
        int gap = (m + n + 1) / 2;

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < m + n) {
                int a, b;

                if (i < m) {
                    a = arr1[i];
                } else {
                    a = arr2[i - m];
                }

                if (j < m) {
                    b = arr1[j];
                } else {
                    b = arr2[j - m];
                }

                if (a > b) {
                    if (i < m && j < m) {
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    } else if (i < m && j >= m) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j - m];
                        arr2[j - m] = temp;
                    } else {
                        int temp = arr2[i - m];
                        arr2[i - m] = arr2[j - m];
                        arr2[j - m] = temp;
                    }
                }
                i++;
                j++;
            }
            if (gap == 1) {
                break;
            }
            gap = (gap + 1) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        merge(arr1, arr2);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        int[] arr3 = {10, 12, 14};
        int[] arr4 = {1, 3, 5};
        merge(arr3, arr4);
        System.out.println("arr1 = " + Arrays.toString(arr3));
        System.out.println("arr2 = " + Arrays.toString(arr4));

        int[] arr5 = {2, 3, 8};
        int[] arr6 = {4, 6, 10};
        merge(arr5, arr6);
        System.out.println("arr1 = " + Arrays.toString(arr5));
        System.out.println("arr2 = " + Arrays.toString(arr6));

        int[] arr7 = {1};
        int[] arr8 = {2};
        merge(arr7, arr8);
        System.out.println("arr1 = " + Arrays.toString(arr7));
        System.out.println("arr2 = " + Arrays.toString(arr8));
    }
}
