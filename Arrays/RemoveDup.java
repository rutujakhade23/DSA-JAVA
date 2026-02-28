import java.util.*;

public class RemoveDup{
    public static int RemoveDup(int nums[]){
        int n = nums.length;
        int i = 0;
        int j =0;
        int k = 0;

        while(i < n){
            nums[k] = nums[i];
            while(j < n && nums[i] == nums[j]){
                j++;
            }
            i = j;
            k++;
        }
        return k;
    }
    public static void main(String args[]){
        int nums[] = {0,1,1,1,2,2,2,3,3,4};
       int k = RemoveDup(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i < k; i++){
        System.out.print(nums[i] + " ");
        }
        
        
    }
}