import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int power = 1;
        for (int input = sc.nextInt(); input>0; ){

            int x = input % 2;
            ans = ans + (x*power);
            power = power*10;
            input = input/2;
        }
        System.out.println(ans);
    }
}
