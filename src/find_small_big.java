import java.util.Arrays;
import java.util.Scanner;

class finder {
    static int[] smallandbig(int[] arr){
        Arrays.sort(arr);
        return arr;
    }


}
public class find_small_big {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lenth of array");
        int n = sc.nextInt();
        int[] list = new int[n];
        System.out.println("enter your array of " + n + " elements ");
        for (int i = 0 ; i<list.length; i++){
            list[i]=sc.nextInt();

        }
//        int[] list = {1,2,3,4,5};
        int[] arr = finder.smallandbig(list);
        System.out.println("largest no = " + arr[arr.length-1]);
        System.out.println("smaallest no = "+ arr[0]);
    }
}
