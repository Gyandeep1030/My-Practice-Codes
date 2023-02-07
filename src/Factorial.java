import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        int x = 1;
        while(n>=i){
            while(i>0){
                x = x*i;
                sum = x;
                i--;
            }
            i++;
            System.out.println("Factorial of ="+sum);
        }

    }
}
