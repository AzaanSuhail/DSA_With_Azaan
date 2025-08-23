package Day1_Fundamentals;
import java.util.*;
public class P3_Type_Promotion {
    public static void main(String[] args) {
        char a='a';
        char b='b';
        
        System.out.println(b-a); 
        System.out.println((int)a);
        System.out.println((int)b);
        
        // Java automatically promotes each byte ,short ,or char operand to int when evaluating an expression
        short c=5;
        byte d=25;
        char e='c'; 
        byte bt=(byte)(c+d+e);
        
        System.out.println(bt);

        // If one operand is long ,float or double the whole expression is promoted to long ,float ,or double respectively
        int f=10;
        float g=79.6f;
        long h=25;
        double i=30;
        double ans=f+g+h+i;
        
        System.out.println(ans);

    }
}
/*

//wrong
byte b=5;
b=b*2;   this is because when java is compiled it thinks that b*2 is a expression and java consider b as integer ans shows lossy conversion type error 
//right 
byte b=5;
b=(byte)(b*2);
 */

 /*
 Type Promotion:

Definition: It refers to the process where smaller data types are automatically promoted to larger data types within expressions to ensure consistency and avoid data loss.
Automatic/Explicit: Automatic.

When It Occurs: This occurs during arithmetic operations or expressions involving mixed data types.

Example: Promoting a byte to an int during an arithmetic operation.

public class TypePromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue * 2; // Automatic type promotion of byte to int
        System.out.println("Int value: " + intValue);
    }
}

 */