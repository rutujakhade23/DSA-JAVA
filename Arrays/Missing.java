public class Missing{
    public static void main(String args[]){
        int arr[] = {3,0,1};
        int n = arr.length;
        int Y = 0;
        int X = (n * (n+1) )/2;   //first finding the total sum of array then substracting the array sum and remaining is the missing no.
        for(int i=0; i<n; i++){
            Y = Y + arr[i];
        }
        System.out.println(X - Y);
    }
}