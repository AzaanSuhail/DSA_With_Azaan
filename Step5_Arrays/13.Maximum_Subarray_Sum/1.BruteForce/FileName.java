import java.util.*;

public class FileName {
    

    //Homework : O(N*N)

    //Kadan's Algorithm 
    public static int Max_Sum_Kadans_Algo(int arr[]){
        int n=arr.length;
        
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<n;++i){
            currSum+=arr[i];

            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1};
        System.out.println(Max_Sum_Kadans_Algo(arr));
    }
}