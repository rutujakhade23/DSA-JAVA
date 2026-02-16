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
