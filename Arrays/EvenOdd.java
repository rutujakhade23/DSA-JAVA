import java.util.*;

public class EvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        if(evenCount > 0){
            for(int i=0 ; i<n; i++){
                if(arr[i] % 2 == 0){
                    System.out.print(" Even no's are " + arr[i] + " ");
                }
            }
            System.out.println();
        }
        if(oddCount > 0){
            for(int i=0; i<n; i++){
                if(arr[i] % 2 != 0){
                    System.out.print(" Odd no's are " + arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
