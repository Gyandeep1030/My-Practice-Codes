import java.util.Scanner;

public class Sum_of_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        while (n>0){
            y=n%10;
            n=n/10;
            x=x+y;
        }
        System.out.println("Sum of Digits ="+x);
    }
}
