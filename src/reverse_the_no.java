import java.util.Scanner;

public class reverse_the_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int store = 0;
        while (n>0){

            store=(store*10)+n%10;
            n=n/10;

        }
        if (store > Integer.MAX_VALUE || store < Integer.MIN_VALUE){

        }
        System.out.println("Reverse = "+store);
    }
}
