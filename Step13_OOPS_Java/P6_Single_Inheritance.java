import java.util.*;

public class P6_Single_Inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        
        shark.swim();
        shark.eat();
        shark.breathe();
    }
}


class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Keyword

class Fish extends Animal{
    int gills;
    String location;

    void swim(){
        System.out.println("Swims");
    }
}