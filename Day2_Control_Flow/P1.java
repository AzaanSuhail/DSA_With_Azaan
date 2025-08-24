import java.util.*;

public class P1 {
    public static void main(String[] args) {
        //Control flow 

        //1. if-else
        //2. switch
        
        int age=23;

        if(age>18){  //condition1
            System.out.println("You are eligible to vote + drive");
        }
        else if(age <14 && age>0){
            System.out.println("You are not eligible to drive");
        }
        //* */ else if
        else{
            System.out.println("You are not eligible to vote");
        }

    }
}