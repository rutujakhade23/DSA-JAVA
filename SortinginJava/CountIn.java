import java.util.*;

public class CountIn {

    // Merge function that also counts inversions
    public static int merge(int arr[], int start, int mid, int end) {
        int count = 0;
        ArrayList<Integer> sortedMerge = new ArrayList<>();

        int i = start;      // first half
        int j = mid + 1;    // second half (IMPORTANT FIX)

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                sortedMerge.add(arr[i]);
                i++;
            } else {
                count += (mid - i + 1); // Count inversions
                sortedMerge.add(arr[j]);
                j++;
            }
        }

        while (i <= mid) {
            sortedMerge.add(arr[i]);
            i++;
        }

        while (j <= end) {
            sortedMerge.add(arr[j]);
            j++;
        }

        // Copy back to original array
        int index = 0;
        for (int k = start; k <= end; k++) {
            arr[k] = sortedMerge.get(index);
            index++;
        }

        return count;
    }

    // MergeSort function
    public static int mergeSort(int start, int end, int arr[]) {
        if (start >= end) {
            return 0;
        }

        int mid = (start + end) / 2;

        int leftPart = mergeSort(start, mid, arr);       // FIXED
        int rightPart = mergeSort(mid + 1, end, arr);   // FIXED
        int mergeInterval = merge(arr, start, mid, end);

        return leftPart + rightPart + mergeInterval;
    }

    // Inversion count function
    public static int inversionCount(int arr[]) {
        int n = arr.length;
        return mergeSort(0, n - 1, arr);
    }

    // Main method
    public static void main(String args[]) {
        int[] arr = {5, 3, 2, 4, 1};

        int inversions = inversionCount(arr);

        System.out.println("Inversion Count = " + inversions);

        System.out.println("Sorted Array = " + Arrays.toString(arr));
    }
}