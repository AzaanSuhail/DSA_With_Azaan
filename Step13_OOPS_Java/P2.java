import java.util.*;

public class P2 {
    public static void main(String[] args) {
        BankAccount azaan=new BankAccount();
        azaan.username="Azaan Suhail";

        System.out.println(azaan.username); //✅

        azaan.setPin("1234");

        System.out.println(azaan.pin);  //❌❌
    }
}


class BankAccount{
    public String username;
    public int age;
    private String pin;

    public void setPin(String pin){
        this.pin=pin;
    }
}