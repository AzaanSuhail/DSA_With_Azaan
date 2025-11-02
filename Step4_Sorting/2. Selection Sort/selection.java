public class selection {
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; ++i) {
            int minPos = i;

            // find the minimum element position in unsorted part
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            // putting it in the correct place in sorted part
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }

        for (int x : arr) {
            System.out.print(x + " ");

        }

    }

    public static void main(String[] args) {
        int arr[]={64,25,11,22,} ;
        selectionSort(arr);
    }
}
