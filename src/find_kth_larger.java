//import java.util.Arrays;
//import java.util.Collection;
import java.util.*;
//import java.util.Scanner;

class kth {
    static int[] small(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
public class find_kth_larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {1,5,4,3,2};
        int[] rlist = kth.small(list);
//        int[] llist = kth.large(list);
        System.out.println("Enter k^th smallest no you want = ");
        int k1 = sc.nextInt();
        System.out.println("Enter k^th largest no you want = ");
        int k2 = sc.nextInt();
        System.out.println("Your " +k1+ " th smallest no = " +rlist[k1-1]);
        System.out.println("Your " +k2+ " th largest no = " +rlist[rlist.length - k2]);






    }
}
