import java.util.Scanner;

class Q1sol{
    static int sol(int[]arr){
        for (int i =1 ; i< arr.length ; i++){
            for (int j = i+1 ; j< arr.length ; j++){
                if (arr[i] == arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array = ");
        int n = sc.nextInt();

        int [] arr = new int[n+1];
        System.out.println("Enter the Elements of Q");
        for (int i = 1 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Q1sol.sol(arr));
    }

}
