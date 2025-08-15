import java.util.Arrays;

class Day1 {
    public static void sortArray(int[] arr) {
        int start = 0, middle = 0, end = arr.length - 1;

        while (middle <= end) {
            if (arr[middle] == 0) {
                swap(arr, start, middle);
                start++;
                middle++;
            }
            else if (arr[middle] == 1) {
                middle++;
            }
            else {
                swap(arr, middle, end);
                end--;
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] arr1 = {0, 1, 2, 1, 0, 2, 1, 0};
        sortArray(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {2, 2, 2, 2};
        sortArray(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {};
        sortArray(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
