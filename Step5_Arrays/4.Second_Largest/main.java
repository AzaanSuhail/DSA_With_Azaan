public import java.util.*;

public class main {
    public static int Second_largest(int arr[]) {
        int n=arr.length;
        Arrays.sort(arr);

        int ans=arr[n-1];
        for(int i=n-2;i>=0;--i){
            if(ans!=arr[i]){
                ans = arr[i];
                break;
            }
        }
        return ans;

    } //Time COmplexit : Nlogn + O(n) ~ o(nlogn)
    //Space complexity :  O(1)
    public static void main(String[] args) {
        
    }
} 
