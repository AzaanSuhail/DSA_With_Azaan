public class P7_Reverse_Number {
    public static void main(String[] args) {
        int x=1234;  //Output : Reverse=4321

        //reverse logic
        while(x!=0){
            int last_digit=x%10; //4 --> 3 --> 2 --> 1
            System.out.print(last_digit);  

            x= x/10;
        }


        //DSA = Linked List   = 123 reverse print
    }
}
