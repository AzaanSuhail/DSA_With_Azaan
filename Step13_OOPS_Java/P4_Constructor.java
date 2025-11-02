import java.util.*;


public class P4_Constructor {
    public static void main(String[] args) {
        // Amit mall=new Amit("69","___n","Pune");

        Explain x=new Explain();


    }
}


class Amit{
    int age;
    String father_Name;
    String address;


    //~ Function/Method  / Paramaterized constructor...
    public Amit(int age,String father_Name,String address){ //Constructor}
        this.age=age;
        this.father_Name=father_Name;
        this.address=address;
    }
}


class Explain {
    String name;
    int warikoo;


    //Default Constructor
    Explain(){
        System.out.println("Azaan Suahil");
        System.out.println("AMit maall");
        System.out.println("Prabhat");
    }

}