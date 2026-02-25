import java.util.*;

public class Basic {

    public static int BasicBinarySearch(int arr[], int target) {
        int st = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (target == arr[mid]) {
                ans = mid;
                break;
            } 
            else if (target > arr[mid]) {
                st = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 4, 8, 9, 11, 15};
        System.out.println(BasicBinarySearch(arr, 11));
    }
}