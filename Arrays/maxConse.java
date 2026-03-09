import java.util.*;

public class maxConse{
    public static int maxConseOnes(int []nums){
        int n = nums.length;
        int ans = 0;
        int sum = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                sum ++;
            }
            else{
                sum = 0;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[]= {1,1,1,0,0,1,1};
        System.out.println(maxConseOnes(nums));
    }
}