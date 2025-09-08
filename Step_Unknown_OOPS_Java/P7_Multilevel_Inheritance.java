import java.util.*;

public class P7_Multilevel_Inheritance {
    public static void main(String[] args) {
        Dog payal=new Dog();
        payal.eat();

    

    }
}



class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    int leg;
    boolean feed_Milk;
}



class Dog extends Mammal{
    void bark(){
        System.out.println("Barks");
    }
}