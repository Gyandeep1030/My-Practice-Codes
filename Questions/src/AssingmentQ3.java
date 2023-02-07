import java.util.Arrays;
import java.util.Scanner;


class Q3{

    public static int find(int[]arr){
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0 ; i< arr.length; i++){
                if(arr[i] != i+1){
                    ans = i+1;
                    break;
                }

        }
        return ans;
    }
}
public class AssingmentQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        int[] list = new int[n-1];
        System.out.println("enter your array of " + list.length + " elements ");
        for (int i = 0 ; i<list.length; i++)
            list[i]=sc.nextInt();
        System.out.println(Q3.find(list));


    }
}
