import java.util.*;

public class CallByvalue_CallBy_Reference {
    public static void Swap(int a, int b) { // Call by value
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside function : " + a);
        System.out.println("Inside function : " + b);
    }

    public static void Multiplybytwo(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i] *= 2;
        }
        System.out.println("Inside function : ");

        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        Swap(a, b);

        System.out.println("Main function : " + a);
        System.out.println("Main function : " + b);

        int arr[] = { 1, 2, 3, 4, 5 };

        Multiplybytwo(arr);
        
        System.out.println("Main function : ");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}