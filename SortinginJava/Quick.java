public class Quick {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low; j<=high-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i , j);
            }
        }
        swap(arr, i+1,  high);
        return i + 1;
    }
    public static void swap (int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void quicksort(int arr[], int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    public static void main(String args[]){
        int arr[] = {10,7,8,9,1,5};
        int n = arr.length;
        quicksort(arr, 0, n-1);

        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
//Quick is another sorting algorithm in this algo one element from array is taken and that is pivot 
//here I took last element ...rearrange the array in manner that the all smaller ele from pivot will on left 
// and all greater element is on right of pivot 
//and pivot will go on its correct place after rearranging  . This is quick sort where the array can sort in this manner 
//Then recursively call the function 
//And then base case is define 
//TC : O(nlogn)
//SC : O(logn)