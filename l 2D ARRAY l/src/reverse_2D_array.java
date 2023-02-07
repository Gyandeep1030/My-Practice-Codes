import java.util.Scanner;

class solver{

    static void interchange(int[]arr ){
        int i = 0 ;
        int j = arr.length-1;
        while (i<j){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;
        }

    }



    static int[][] rev(int[][]arr){
        for (int i=0; i<arr.length; i++){
            solver.interchange(arr[i]);
        }
        return arr;
    }

    static int[][] transposetemp(int[][]arr , int r , int c){

        int[][] ans = new int[c][r];

        for (int i = 0 ; i<c; i++){
            for (int j = 0 ; j<r; j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    static int[][] transpose(int[][]arr , int r , int c){

        for (int i = 0 ; i<c; i++){
            for (int j = i ; j<r; j++){
                int temp= arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }
        return arr;
    }
}



public class reverse_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking first 2D array

        System.out.println("Enter How many Row");
        int r = sc.nextInt();
        System.out.println("Enter How many col");
        int c = sc.nextInt();
        int[][]arr1 = Callme.input(r,c);



        solver.transpose(arr1 , r ,c);
    }


}
