import java.util.*;

public class InsertEle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int value = sc.nextInt();
        int posi = sc.nextInt();
        int ans[] = new int[n+1];
        int i =0;
        int j = 0;
        while(i < n+1){
            if(i == posi - 1){
                ans[i] = value;
            }
            else{
                ans[i] = arr[j];
                j++;
            }
            i++;
        }
        i = 0;
        while(i < n + 1){
            System.out.print(ans[i]);
        i++;        }
    }
}
