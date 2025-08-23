package Day1_Fundamentals;


public class P4_Operators {
    public static void main(String[] args) {
/*         //1 . Arithmetic Operators
        int a=10;
        int b=5;
    
        System.out.println("Add="+   (a+b));
        System.out.println("Subtract="+(a-b));
        System.out.println("Multiply="+(a*b));
        System.out.println("Divide="+(a/b));
        System.out.println("Modulo(remainder)="+(a%b)); */


        /* 
        String str="Azaan";
        int age=24;

        System.out.print(str + "         " + age); //Azaan 24 */


        //2.Unary Operators
     

          //Pre increment operator
        int a=10;
        int b=++a;  //a=a+1 ->  b=a
        
        System.out.println(a);  //11
        System.out.println(b); //11

        System.out.println("-------------------------------------------");
        //Post increment operator
        
        int c=10;
        int d=c++; //d=c -> c=c+1
        
        System.out.println(c); //11
        System.out.println(d);//10

        System.out.println("-------------------------------------------");
        //pre decrement operator
        
        int e=10;
        int f=--e; //e=e-1 -> f=e
        
        System.out.println(e); //9
        System.out.println(f); //9

        System.out.println("-------------------------------------------");
        
        //post decrement operator'
        int g=10;
        int h=g--; //g=h, h=h-1
        
        System.out.println(g); //9
        System.out.println(h); //9


        //Assignment Operators
        int a=10;    

      
        
        a+=10; //a=a+10
    
        a-=10;  //a=a-10

        a*=10; //a=a*10

        a/=10; //a=a/10

        a %=10; //a=a%10

        int p=10;


        //Logical Operators
        int a=10;
        int b=6;
        
        System.out.println(a==b);
        System.out.println(a!=b);  
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        // https://www.geeksforgeeks.org/java/operators-in-java/
    }
}
