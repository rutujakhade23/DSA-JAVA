//Problem : Maximum subarray (kadanes's algo)
//platform : leetcode 
//approach : 1.Keep current sum (cs)
//2. update maxsum at each step
//3. if cs becomes negative , reset to 0
// time complexity : O(n)  and Space complexity : O(1)

import java.util.*;

public class Kadane {

    public static int Kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];

            if(cs > maxSum) {
                maxSum = cs;
            }

            if(cs < 0) {
                cs = 0;
            }
        }

        return maxSum;
    }

    public static void main(String args[]) {
        int arr[] = {1,2,-3,7,1,2,-9};
        int result = Kadanes(arr);
        System.out.println(result);
    }
}
