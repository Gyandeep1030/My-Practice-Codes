import java.util.Scanner;

class Callme{

    static void print2D(int[][]arr){
        for (int i = 0 ; i< arr.length ; i++){
            for (int j = 0 ; j<arr[i].length; j++ ){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] input(int r , int c){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[r][c];
        for (int i = 0; i<r ; i++){
            for (int j = 0; j<c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static void sum(int[][]arr ,int r , int c, int[][]arr1,int r1 , int c1){
        if (r != r1 || c != c1 ){
            System.out.println("XXX Wrong XXX");
            return;
        }
        int[][] sum = new int[r][c];

        for (int i = 0 ; i<sum.length; i++){
            for (int j =0 ; j<sum[i] .length; j++){
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }

        Callme.print2D(sum);

    }

    static void multiply(int[][]arr ,int r , int c, int[][]arr1,int r1 , int c1){
        if (c != r1){
            System.out.println("XXX Wrong Arrays For Product XXX");
            return;
        }
        int[][] ans = new int[r][c1];

        for (int i = 0 ; i<r; i++){ // row
            for (int j =0 ; j<c1; j++){ //
                for (int k =0 ; k<c; k++){
                        ans[i][j] +=  (arr[i][k]*arr1[k][j]);
                }
            }
        }
        Callme.print2D(ans);

    }

}




public class Add_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking first 2D array

        System.out.println("Enter How many Row");
        int r = sc.nextInt();
        System.out.println("Enter How many col");
        int c = sc.nextInt();
        int[][]arr1 = Callme.input(r,c);

        //taking second 2D array

        System.out.println("Enter How many Row");
        int r1 = sc.nextInt();
        System.out.println("Enter How many col");
        int c1 = sc.nextInt();
        int[][] arr2 = Callme.input(r1,c1);


        Callme.multiply(arr1 , r , c , arr2 , r1 , c1 );









    }
}
