import java.util.Scanner;

public class Binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int x = 1;
        int input = sc.nextInt();

        while (input>0){
            int i = input%10;
            ans +=(i*x);
            input = input/10;
            x*=2;


        }
        System.out.println(ans);
    }
}
