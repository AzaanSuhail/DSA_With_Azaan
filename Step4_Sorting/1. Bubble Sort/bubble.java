import java.util.*;

public class  bubble{
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //Brute Force :
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        int pass=n-1;

        for(int i=0;i<pass;++i){//Pass waai cheez
            for(int j=0;j<n-1;++j){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }

        System.out.println("Sorted Array: ");
        for(int x: arr){
            System.out.print(x+" ");
        }

        //Time Complexity : O(N*N)
        //Space Complexity : O(1)
    }
    
    public static void bubbleSort2(int arr[]) {
    public static void bubbleSort3(int arr[]) {
        int n = arr.length;
        int pass = n - 1;
        boolean isSwap=false;

        for (int i = 0; i < pass; ++i) {// Pass waai cheez
            for (int j = 0; j < n - 1-i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwap=true;
                }
                if(isSwap==false){
                    break;
                }
            }
        }

        System.out.println("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        // Time Complexity : O(N*N)
        // Space Complexity : O(1)
    }
}
    public static void main(String[] args) {
        int arr[]={2,10,8,7};
        bubbleSort(arr);
    }
}