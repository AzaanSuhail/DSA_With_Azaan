import java.util.*;

public class FileName {
    //Ques 1 : Number of Digits in a number
    public static int Number_Digits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }
    
    public static int Sum_Digits(int n) {
        int sum = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 2;
        }

        return sum;
    }
    public static void main(String[] args) {
        int n=1234561203;
        System.out.println(Sum_Digits(n));
    }
}