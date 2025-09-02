

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
    public static void main(String[] args) {
       Shrishti_print_Recur(10); 
    }
}
