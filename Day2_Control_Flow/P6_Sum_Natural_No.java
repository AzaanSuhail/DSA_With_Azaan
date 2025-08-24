public class P6_Sum_Natural_No {
    public static void main(String[] args) {
        int n = 5;

        // 1 2 3 4 5

        int i = 1;
        int sum1 = 0; // & storing ans

        while (i <= n) {
            sum1 = sum1 + i; // sum1=1 --> sum1=1(purana sum)+2

            i++;
        }

        System.out.println("Sum is " + sum1);

        int sum2 = 0;
        for (int j = 1; j <= n; ++j) {
            sum2 += j; // sum2=sum2+j
        }


        //? We have to find the sum first even no. till n1

        int even_sum=0;
        int n1=4;

        //~ 2 4 6 8

        for(int k=2;k<=n1;k=k+2){ //2 4 6 8
            even_sum+=k;
        }
        System.out.println(even_sum);

    }
}
