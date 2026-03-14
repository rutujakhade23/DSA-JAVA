public class FirstLast {

    public int firstO(int nums[], int target){
        int index = -1;
        int st = 0;
        int end = nums.length - 1;

        while(st <= end){
            int mid = st + (end - st) / 2;

            if(nums[mid] == target){
                index = mid;
                end = mid - 1;
            }
            else if(nums[mid] < target){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return index;
    }

    public int lastO(int nums[], int target){
        int index = -1;
        int st = 0;
        int end = nums.length - 1;

        while(st <= end){
            int mid = st + (end - st) / 2;

            if(nums[mid] == target){
                index = mid;
                st = mid + 1;
            }
            else if(nums[mid] < target){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return index;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{ firstO(nums, target), lastO(nums, target) };
    }

    public static void main(String[] args) {

        FirstLast obj = new FirstLast();  // 👈 changed here

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = obj.searchRange(nums, target);

        System.out.println("First Position: " + result[0]);
        System.out.println("Last Position: " + result[1]);
    }
}