import java.util.Arrays;
import java.util.Scanner;
public class Q3tanmay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        int[] list = new int[n-1];
        System.out.println("enter your array of " + list.length + " elements ");
        for (int i = 0 ; i<list.length; i++)
            list[i]=sc.nextInt();

        int sum = 0;
        int mainsum = 0;

        for (int i=0; i <= n; i++ ){
            sum = sum + i;
        }

        for (int i = 0 ; i<list.length ; i++){
            mainsum = mainsum + list[i];
        }

        int ans = sum - mainsum;

        System.out.println(ans);


    }
}
