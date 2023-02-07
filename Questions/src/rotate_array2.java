import java.util.Scanner;

public class rotate_array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter K = ");
        int k = sc.nextInt();
        System.out.println("enter N = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0 ; i<n; i++) {
            arr[i] = sc.nextInt();
        }


        k = k%n;


        rotate1.reverse(arr , 0 , arr.length-k-1);
        rotate1.reverse(arr , arr.length-k , arr.length-1);
        rotate1.reverse(arr , 0 , arr.length-1);


        for (int i = 0 ; i< rotate1.reverse(arr , 0 , arr.length-1).length ;i++){
            System.out.print(rotate1.reverse(arr , 0 , arr.length-1)[i]);
        }
    }
}
