import java.util.Scanner;

public class raisetothepower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your main no. = ");
        int a = sc.nextInt();
        System.out.println("Enter your raised no no. = ");
        int x = 1;
        int b = sc.nextInt();
        int i = 1;
        while (i<=b){
            x = x*a;
            i++;
        }
        System.out.println("Your answer is = "+x);


    }


}
