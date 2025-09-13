

public class main {
    public static void Print(){
        System.out.println("Azaan");

        Print(); //!recursice call
    }

    public static void Shrishti_Print(){
        //Iterative
        for(int i=0;i<10;++i){
            System.out.println("Shrishti");
        }
    }

    public static void Shrishti_print_Recur(int n){
        if(n==0){ //Base case
            return ;
        }

        System.out.println("Shrishti"); //kaam

        Shrishti_print_Recur(n-1);  //recursive call
    }
    
    // ~Base Case !=infinite
    // * Kaam
    // ^ Recursive call

    //Ques1 : Print Number in decreasing order using recursion
    public static void Print_Decreasing(int n){
        //Base case
        if(n==0){ //Base case
            return ;
        }

        System.out.print(n+" "); //kaam

        Print_Decreasing(n-1); //Recursive call
    }

    public static void Print_Increasing(int n){
        //Base case
        if(n==0){ //Base case
            return ;
        }

        Print_Increasing(n-1); //Recursive call();
        System.out.print(n + " "); // kaam
    }
    public static void main(String[] args) {
             Print_Increasing(5);
    }
}
