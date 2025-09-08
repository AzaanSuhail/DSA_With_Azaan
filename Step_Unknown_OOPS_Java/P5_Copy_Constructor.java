import java.util.*;

public class P5_Copy_Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Azaan Suhail";
        s1.roll=1001;
        s1.marks=new int[]{100,99,55};
        s1.password="abcdland";

        s1.marks[0]=88;
        s1.marks[1]=98;
        s1.marks[2]=43;


        Student s2=new Student(s1);
        s2.password="xyz__";
        s1.marks[2]=41;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

        
    }
}


class Student{
    String name;
    int roll;
    String password;
    int marks[];


    //Copy constructor

    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
}
