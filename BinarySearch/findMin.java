class Solution {

    public static int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // Check if mid is minimum
            if (nums[(mid - 1 + n) % n] > nums[mid] &&
                nums[mid] < nums[(mid + 1) % n]) {
                return nums[mid];
            }

            // If array is already sorted
            if (nums[start] <= nums[mid] && nums[mid] <= nums[end]) {
                return nums[start];
            }

            // Left part sorted, go right
            else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            }

            // Right part sorted, go left
            else {
                end = mid - 1;
            }
        }

        return nums[0];
    }

    public static void main(String args[]) {
        int nums[] = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums));
    }
}