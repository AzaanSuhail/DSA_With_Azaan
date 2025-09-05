import java.util.*;

public class FileName {
    //class blue of objects
    public static void main(String[] args) {
        //Amit = object
        Registration amit=new Registration("Amit",200,"Azaan","Pune",1234567890,"CSE"); //LEARN Object creation = Memory allocate

        System.out.println(amit.address);
        System.out.println(amit.age);
        System.out.println(amit.branch);
        System.out.println(amit.father_name);
        System.out.println(amit.mobile_number);
        System.out.println(amit.name);
    }
}

class Registration{ //! REC Registration  
    //defined the properties only name them with their proper datatype
    //NOTE : No memory allocated 
    String name;
    int age;
    String father_name;
    String address;
    int mobile_number;
    String branch;
    
    //Constructor
    public Registration(String name,int age,String father_name,String address,int mobile_number,String branch){
        this.name=name;
        this.age=age;
        this.father_name=father_name;
        this.address=address;
        this.mobile_number=mobile_number;
        this.branch=branch;
    }
}