import java.util.*;

public class Merge {
    public void merge(int st, int end, int nums[]){
        int i = st;
        int mid = (st + end) / 2;
        int j = mid + 1;
        

        ArrayList<Integer>arr = new ArrayList<>();
        while(i<= mid && j<=end){
            if(nums[i] <= nums[j]){
                arr.add(nums[i]);
                i++;
            }
            else{
                arr.add(nums[j]);
                j++;
            }
        }
        while(i<=mid){
            arr.add(nums[i]);
            i++;
        }
        while(j<=end){
            arr.add(nums[j]);
            j++;
        }
        int index =0;
        for(int k=st; k<=end; k++){
            nums[k] = arr.get(index);
            index++;
        }
    }
    public void mergeSort(int st, int end, int []nums){
        if(st >= end){
            return;
        }
        int mid = (st + end) / 2;
        mergeSort(st, mid, nums);
        mergeSort(mid + 1, end, nums);
        merge(st, end, nums);
    }
   public int[]sortArray(int []nums){
    int n = nums.length-1;
    mergeSort(0, n , nums);
    return nums;
   }
   public static void main(String[] args) {
    Merge obj = new Merge();
    int[] arr = {5, 2, 3, 1, 4};

    obj.sortArray(arr);

    System.out.println(Arrays.toString(arr));
}
}

