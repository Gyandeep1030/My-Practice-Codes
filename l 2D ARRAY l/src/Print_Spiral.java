import java.util.Scanner;

class Spiral{

    static void sinput(int n){
        int[][] ans = new int[n][n];
        int up = 0 , right = n-1 , down = n-1 , left =0;

        int counter = 1;
        while (counter <= n*n){
            for (int i = left ; i <= right && counter <= n*n ; i++){
                ans[up][i] = counter++;
            }
            up++;
            for (int i = up ; i <= down && counter <= n*n; i++ ){
                ans[i][right] = counter++;
            }
            right--;
            for (int i = right ; i >= left && counter <= n*n ; i-- ){
                ans[down][i] = counter++;
            }
            down--;
            for (int i = down; i >=up && counter <= n*n ; i-- ){
                ans[i][left] = counter++;

            }
            left++;
        }
        Callme.print2D(ans);

    }

    static void printer(int[][]arr ,int r ,int c){
        int up = 0  , right = c-1 , down = r-1, left = 0;
        int counter = 0;
        while(counter < r*c){
            for (int i = left ; i <= right && counter < r*c ; i++){
                System.out.print(arr[up][i]+" ");
                counter++;
            }
            up++;
            for (int i = up ; i <= down && counter < r*c ; i++ ){
                System.out.print(arr[i][right]+" ");
                counter++;
            }
            right--;
            for (int i = right ; i>=left && counter < r*c ; i--){
                System.out.print(arr[down][i]+" ");
                counter++;
            }
            down--;
            for (int i = down; i>=up && counter < r*c ; i-- ){
                System.out.print(arr[i][left]+" ");
                counter++;
            }
            left++;
        }


    }
}


public class Print_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        //taking first 2D array
//
//        System.out.println("Enter How many Row");
//        int r = sc.nextInt();
//        System.out.println("Enter How many col");
//        int c = sc.nextInt();
//        int[][]arr1 = Callme.input(r,c);


//        Spiral.printer(arr1 , r ,c);

        int n = sc.nextInt();
        Spiral.sinput(n);



    }


}
