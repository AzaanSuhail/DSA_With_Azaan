import java.util.*;

public class P1 {

    public static void Sieve_Of_Eratosthenes(int n) {

        // Step1
        int arr[] = new int[n + 1];

        // Step2 : Considering all are primes
        for (int i = 2; i < n + 1; ++i) {
            arr[i] = 1;
        }

        // Step3
        for (int i = 2; i <= (int) Math.sqrt(n + 1); ++i) {
            if (arr[i] == 1) {
                // Unmarked all its multiples as non-primes
                for (int j = i * i; j <= n; j = j + i) {
                    arr[j] = 0;
                }

            }
        }

        int count = 0;
        for (int i = 2; i <= n; ++i) {
            if (arr[i] == 1) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nCount=" + count);
    }

    public static void main(String[] args) {
        Sieve_Of_Eratosthenes(13);
    }
}