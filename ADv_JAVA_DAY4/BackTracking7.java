package ADv_JAVA_DAY4;
public class BackTracking7 {
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            //check if Left half must be sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            // check if Right half must be sorted
            else {
                if (arr[mid] < target && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1; // Target not found
    }
    public static void main(String[] args) {
        int[] nums= {4,5,6,7,0,1,2};
        int target =4;
        int result=search(nums,target);
        System.out.println("Index of target "+target+" : "+result);
    }
}
