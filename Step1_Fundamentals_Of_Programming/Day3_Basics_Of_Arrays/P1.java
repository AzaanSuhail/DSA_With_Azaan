
import java.util.*;

public class P1 {
    // Quest1 : Print each element & its index of the array

    public static void printArray(int arr[]) {
        int n = arr.length; // String .length() --> length of string

        for (int i = 0; i < n; ++i) {
            System.out.print(" Index=" + i + " Element=" + arr[i] + "\n");
        }
    }
    
    // Quest2 : Reverse Array
    public static void reverserArray(int arr[]) {
        int n=arr.length;

        for(int i=n-1; i>=0;--i){
            System.out.print(arr[i]+" ");
        }
    }


    public static void Swap(int arr[],int i,int j){
        int temp=arr[i]; 
        arr[i]=arr[j];
        arr[j]=temp;    
    }
    public static void Reverse_Array_Optimized(int arr[]){ //function 2
        int n=arr.length;

        int i=0;
        int j=n-1;

        while (i<j) {
            Swap(arr,i,j);  //function 3

            i++;
            j--;
        }

        for(int k=0;k<n;++k){
            System.out.print(arr[k]+" ");
        }
    } 
    
    //Quest3 : Print Alternate element
    public static void printAlternate(int arr[]){
        int n=arr.length;

        for(int i=0;i<n;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
    //Quest H.w:Create two arrays one for odd elements and one for even elements
    //LEARN : Calculate sum and product of array elements.
    //NOTE Count occurrences of a target number in an array

    public static void main(String[] args) {
        // Declare array
        int arr[]={1,2,3,4,5,6,7,8,9,10}; //!c styled defined method

        // int[] arr = { 145, 2, 3, 4, 5, 6, 7867, 8, 9, 10 }; // Java styled defined method
        Reverse_Array_Optimized(arr); //main
    }
}
