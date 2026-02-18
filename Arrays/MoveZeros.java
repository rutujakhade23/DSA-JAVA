class Solution {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;

        int i = 0;
        int j = 0;

        while(j < n){
            if(nums[j] != 0)
            {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        while(i<n)
        {
            nums[i] = 0;
            i++;
        }
    }
    public static void main(String args[]){
        int arr[] = {0,1,0,4,6};
        moveZeroes(arr);
        for(int num : arr){
            System.out.println(num + " ");
        }
    }
}