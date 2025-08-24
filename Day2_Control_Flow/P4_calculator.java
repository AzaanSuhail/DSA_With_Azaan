import java.util.*;

public class P4_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator = sc.next().charAt(0);

        int a = 14;
        int b = 2;

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);

                break;

            default:
                System.out.println("Invalid operator");
                break;
        }

    }
}
