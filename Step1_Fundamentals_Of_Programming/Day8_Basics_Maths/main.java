import java.util.*;

public class main {
    // Ques1 : Sum of Digits
    // ^ 1234 = 1+2+3+4=10

    public static void Sum_Digits(int n) {
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }

        System.out.println("Sum =" + sum);
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindrome_Recursion(String str, int start, int end) {
        if (start > end) {
            return true;
        }

        // Kaam
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrome_Recursion(str, start + 1, end - 1);
    }
    //Ques : Factorial of a Number
    public static void Factorial1(int n){
        int fact=1;

        //Start to end
        for(int i=1;i<n;++i){
            fact =fact*i;
        }

        System.out.println(fact);
    }
    public static void Factorial2(int n){
        int fact=1;

        //Start to end
        for(int i=n;i>=1;--i){
            fact =fact*i;
        }

        System.out.println(fact);
    }
    public static int Factorial3_Recursion(int n){
        //Base Case :
        if(n==0){
            return 1;
        }

        return n*Factorial3_Recursion(n-1);
    }
    public static boolean isPrime(int n){
        //Brute Force
        if(n<2){
            return false;
        }

        if(n==2){
            return true;
        }

        for(int i=3;i<n;++i){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    
    //HOMEWORK 
    public static void main(String[] args) {
        // Sum_Digits(01234);
        // System.out.println(isPalindrome("BOOk"));
        // *System.out.println(isPalindrome_Recursion("BOOB", 0, 3));

        System.out.println(isPrime(11111));

    }
}
