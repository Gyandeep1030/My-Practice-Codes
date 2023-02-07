import java.util.Scanner;

public class swaping_values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b = ");
        int b = sc.nextInt();
        System.out.println("before swaping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a = a+b ;
        b = a-b;
        a = a-b;

        System.out.println("After swaping");

        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}
