import java.util.*;

public class FileName {
    // Approach 1 : Sorting n logn
    // Approach 2:
    public static void Segregate_0_1_2(int arr[]) {
        int n = arr.length;

        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for (int i = 0; i < n; ++i) {
            if (arr[i] == 0) {
                count_0++;
            } else if (arr[i] == 1) {
                count_1++;
            } else {
                count_2++;
            }
        }

        for (int i = 0; i < count_0; ++i) {
            arr[i] = 0;
        }
        for (int i = count_0; i < count_0 + count_1; ++i) {
            arr[i] = 1;
        }
        for (int i = count_0 + count_1; i < n; ++i) {
            arr[i] = 2;
        }
    }

    // Tc : O(N)
    // Sc : O(1)

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // NOTE : Dutch National Flag algorithm / Two pointer approach
    public static void Dutch_Algorithm(int arr[]) {
        int n = arr.length;

        int low = 0;
        int high = n - 1;
        int mid = 0; // * fully unsorted array is given

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
            }
        }

        //printing the array
        for(int i=0;i<n;++i){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={0,0,1,0,1,2,0};
        Dutch_Algorithm(arr);
    }
}