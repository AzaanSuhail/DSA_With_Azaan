import java.util.*;

public class main {
    public static int Min_Element(int arr[]){
        int n=arr.length;
        int min=Integer.MAX_VALUE; //+ infinity

        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
        }

        return min;
    } //Time Complexity :  O(N)
    //Space Complexity : O(1)
    
    public static int Max_Element(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;++i){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    
    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public static void main(String[] args) {
        int arr[]={1,3,5,6,9,100};

    }
}
