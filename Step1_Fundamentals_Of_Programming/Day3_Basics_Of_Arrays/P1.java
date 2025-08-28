
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
        int n = arr.length;

        for (int i = n - 1; i >= 0; --i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void Reverse_Array_Optimized(int arr[]) { // function 2
        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            Swap(arr, i, j); // function 3

            i++;
            j--;
        }

        for (int k = 0; k < n; ++k) {
            System.out.print(arr[k] + " ");
        }
    }

    // Quest3 : Print Alternate element
    public static void printAlternate(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    // Quest4 H.w:Create two arrays one for odd elements and one for even elements
    public static void odd_even(int arr[]) {
        int n = arr.length;
        // n/2 =even n/2=odd
        int even[] = new int[n / 2];
        int odd[] = new int[n / 2];

        int j = 0; // even
        int k = 0; // odd

        for (int i = 0; i < n; ++i) {
            if (arr[i] % 2 == 0) {
                even[j] = arr[i];
                j++;
            }

            else {
                odd[k] = arr[i];
                k++;
            }
        }
    }

    // Ques5 : Calculate sum and product of array
    public static void sum_product(int arr[]) {
        int sum = 0;
        int product = 1;

        // Sum
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }

        // Product
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];

        }

        System.out.println("Sum=" + sum);
        System.out.println("Product=" + product);
    }

    // Ques6 Count occurrences of a target number in an array
    public static void count_occ(int arr[], int target) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; ++i) {
            if (arr[i] == target) {
                count = count + 1; // count +=1
            }
        }

        System.out.println("Count=" + count);
    }

    // Ques7:Check if an array is sorted forward, backward, or not at all.
    public static void Check_forward_Backward_None_Sorted(int arr[]) {
        int n = arr.length;

        boolean isForward = true;
        boolean isBackward = true;

        // Check forward
        for (int i = 1; i < n; ++i) {
            if (arr[i] > arr[i - 1]) {
                isBackward = false;
            }
        }

        // Check backward
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                isForward = false;
            }
        }

        // Ans = isForward && isBackward
        if (isForward == true) {
            System.out.println("Forward");
        } else if (isBackward == true) {
            System.out.println("Backward");
        } else if (!isForward && !isBackward) {
            System.out.println("None");
        }
    }

    // Ques8 : Minimum and Maximum
    public static void Min_Max(int arr[]) {
        int n = arr.length;

        int min = Integer.MAX_VALUE; //+infinite
        int max = Integer.MIN_VALUE;  // - infinte

        for (int i = 0; i < n; ++i) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);  

        }


    }

    //Ques9: Insertion & Deletion in an array => Why linked list


    public static void main(String[] args) {
        // Declare array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 1 }; // ! c styled defined method

        // int[] arr = { 145, 2, 3, 4, 5, 6, 7867, 8, 9, 10 }; // Java styled defined
        // method
        Check_forward_Backward_None_Sorted(arr); // main
        //addition
    }
}
