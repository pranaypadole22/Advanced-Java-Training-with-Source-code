package ADv_JAVA_DAY4;

import java.util.Arrays;

public class BinarySearch {
    public static void searching(int[] arr, int target) {
Arrays.sort(arr);
        int L = 0;
        int R = arr.length - 1;

        while (L <= R) {
            int mid = (L + R) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < target) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        System.out.println("Element not found.");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 69, 45, 8,4};
        int t = 4;
        searching(arr, t);
    }
}
