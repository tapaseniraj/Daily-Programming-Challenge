public class Day2 {
    public static int missingNumber(int[] arr){
        int n = arr.length + 1;
        long totalSum = (long) n * (n + 1) / 2;
        long currSum = 0;
        for (int num : arr) {
            currSum += num;
        }
        return (int)(totalSum - currSum);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(missingNumber(arr));
        int[] arr1 = {2,3,4,5};
        System.out.println(missingNumber(arr1));
        int[] arr2 = {1,2,3,4};
        System.out.println(missingNumber(arr2));
        int[] arr3 = {1};
        System.out.println(missingNumber(arr3));
        int[] arr4 = new int[999999];
        for (int i = 0; i < 999999; i++) {
            arr4[i] = i + 1;
        }
        System.out.println(missingNumber(arr4));
    }
}
