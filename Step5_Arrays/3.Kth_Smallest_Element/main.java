public class main {
    public static void find_kth_smallest(int arr[], int k) {
        Arrays.sort(arr); //n logn
        int count = 1;

        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] != arr[i - 1]) {
                count++;

                if (count == k) {
                    System.out.println(arr[i] + "ans");
                    break;
                }
            }
        }
    }

    /*
     * Time Complexity - nlog(n)
     * Space Complexity - O(1)
     */
    public static void main(String[] args) {
        
    }
}
