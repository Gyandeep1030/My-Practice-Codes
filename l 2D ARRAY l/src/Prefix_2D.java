import java.util.Scanner;

class Pre{
    static void add2d(int[][]arr , int l1 , int r1 , int l2 , int r2){
        int ans = 0;
        for (int i=l1 ; i<=l2 ; i++){
            for (int j =r1 ; j<=r2 ; j++){
                ans = ans + arr[i][j];
            }
        }
        System.out.println("ans = " + ans );
    }

    static void fixc(int[][]arr){
        for (int i =0 ; i<arr.length ; i++){
            for (int j =1; j<arr[i].length; j++){
                arr[i][j] = arr[i][j] + arr[i][j-1];
            }
        }
    }

    static void sum(int[][]arr , int l1 , int r1 , int l2 , int r2){
        int ans = 0;
        for (int i = l1; i<=l2 ; i++){
            ans += arr[i][r2] - arr[i][r1 - 1];
        }
        System.out.println(ans);
    }

    static void fixr(int[][]arr , int l1 , int r1 , int l2 , int r2){
        for (int i =0 ; i<arr.length ; i++){
            for (int j =1; j<arr[i].length; j++){
                arr[j][i] = arr[j][i] + arr[j-1][i];
            }
        }
        int ans = arr[l2][r2] - arr[l1-1][r2] - arr[l2][r1-1] + arr[l1-1][r1-1];
        System.out.println(ans);

    }


}

public class Prefix_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1},};

        System.out.println("Enter your l1");
        int l1 = sc.nextInt();

        System.out.println("Enter your r1");
        int r1 = sc.nextInt();

        System.out.println("Enter your l2");
        int l2 = sc.nextInt();

        System.out.println("Enter your r2");
        int r2 = sc.nextInt();




        Pre.fixc(arr);
        Pre.fixr(arr , l1 ,r1 ,l2 ,r2);
        //Pre.sum(arr , l1 ,r1 ,l2 ,r2);

    }
}
