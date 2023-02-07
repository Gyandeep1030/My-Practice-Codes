import java.util.Scanner;

public class rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter K = ");
        int k = sc.nextInt();
        System.out.println("enter N = ");
        int n = sc.nextInt();
        int j = 0;
        int[] list = new int[n];
        int[] copy = new int[n];
        for (int i = 0 ; i<n; i++) {
            list[i] = sc.nextInt();
        }

        if (k > n){
            k = k%n;
        }

        // rotate
        for (int i = n-k ; i<n ; i++){
            copy[j++] = list[i];
        }


        
        for (int i = 0 ; i<n-k ; i++){
            copy[j++] = list[i];
        }

        System.out.println(copy[0]+" "+copy[1]+" "+copy[2]+" "+copy[3]+" "+copy[4]);



    }
}
