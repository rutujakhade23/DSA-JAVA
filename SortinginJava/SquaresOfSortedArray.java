import java.util.*;
public class SquaresOfSortedArray {
    public int[] SquaresOfSoretedArray(int []nums){
        int n = nums.length;
        int answer[] = new int[n];
        int index = n-1;
        int i =0;
        int j = n-1;
        while(i<=j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                answer[index] = nums[i] * nums[i];
                i++;
            }
            else{
                answer[index] = nums[j]*nums[j];
                j--;
            }
            index--;
        }
        return answer;
    }
    public static void main(String args[]){
        SquaresOfSortedArray obj = new SquaresOfSortedArray();
        int nums[] = {-4,-1,0,3,10};
        int result[] = obj.SquaresOfSoretedArray(nums);
        System.out.println(Arrays.toString(result));
    }
}
