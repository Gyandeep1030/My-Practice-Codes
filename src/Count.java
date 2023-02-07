import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int n = sc.nextInt();
        int Count = 0;
        while (n>0) {
            n = n / 10;
            Count++;
        }
        System.out.println(Count);

    }
}
