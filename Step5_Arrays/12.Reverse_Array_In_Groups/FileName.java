import java.util.*;

public class FileName {
    public static void Reverse(ArrayList<Integer> arr, int left, int right) {
        while (left <= right) {
            int t = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, t);

            left++;
            right--;
        }
    }

    public static void Reverse_Groups(int arr[], int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            Reverse(arr, left, right);

        }
    }
    public static void main(String[] args) {
        
    }
}