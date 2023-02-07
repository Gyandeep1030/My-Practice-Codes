import java.util.Scanner;

class callme{
    static void prefix(int[]arr){
        // Prefix'ing
        for (int i = 1 ; i<arr.length; i++){
            int j = i -1;
            arr[i] = arr[i] + arr[j];
        }

    }


    static int ans( int[]arr ,int l , int r){
        int ans = arr[r] - arr[l-1] ;
        return ans;
    }
}


public class prefix_sum_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating Array
        System.out.println("Enter lenth of array");
        int n = sc.nextInt();
        int [] a = new int[n+1];
        for (int i = 1 ; i <= n ; i++){
            a[i] = sc.nextInt();
        }

        callme.prefix(a);


        System.out.println("Enter How many Questions You want to ask");
        int q = sc.nextInt();
        for (int i =1; i<=q  ; i++){
            System.out.println("Ask Question "+i);
            System.out.println("Enter value of l");
            int l = sc.nextInt();
            System.out.println("Enter value of r");
            int r = sc.nextInt();
            System.out.println("Ans = "+callme.ans(a , l , r));
        }
    }
}

