import java.util.*;

public class counting{
    public static void counting_sort(int arr[]){
        int n=arr.length;

        //Step 1 : Finding max element
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            max=Math.max(max,x);
        }

        //Step 2 : Creating count array
        int freq[]=new int[max+1];

        for(int x:arr){
            freq[x]++;
        }

        //Step 3 : 
        int index=0;

        for(int i=0;i<freq.length;++i){
            while(freq[i]>0){
                arr[index]=i;
                index++;
                freq[i]--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,4,2,2,7,1};

    }
}
