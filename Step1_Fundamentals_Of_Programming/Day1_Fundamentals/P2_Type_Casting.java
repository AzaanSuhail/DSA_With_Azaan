package Step1_Fundamentals_Of_Programming.Day1_Fundamentals;
import java.util.*;

public class P2_Type_Casting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        float a=24.13f; //large  
        int b=(int)a;
        System.out.println(b);

        float marks=99.99f;
        int marks2=(int)marks;
        System.out.println(marks2); //Output: 99

        char ch='a';  //ascii value print
        char ch1='A';

        int number=ch;  
        int num2=(int)ch1;

        //*  : Datatype name_variabe=variable_value

        System.out.println(number); 
        System.out.println(num2); 



    }
}
/*
Question :)-->
https://www.geeksforgeeks.org/problems/sum-of-series2811/1?page=2&sortBy=submissions


Type Casting:

Definition: It refers to the process where the programmer explicitly converts one data type to another, typically when converting a larger data type to a smaller data type. 
Explicit

When It Occurs: This occurs when a larger type is being assigned to a smaller type or when converting between incompatible types.

Example: Casting a double to an int or an Object to a specific class type

public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleValue = 9.78;
        int intValue = (int) doubleValue; // Explicit type casting from double to int
        System.out.println("Double value: " + doubleValue);
        System.out.println("Int value: " + intValue);
    }
}

 */