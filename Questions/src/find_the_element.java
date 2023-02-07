import java.util.Scanner;


class elementcheck{
    static void check(int[]arr , int[]check){
        String ans = "no";

        for (int i = 0 ; i<check.length; i++){
            for (int j = 0; j<arr.length; j++){
                if(arr[j] == check[i]){
                    ans = "yes";
                }
            }
            System.out.println(check[i] + "=" + ans);
            ans = "no";

        }
    }
}

public class find_the_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("Enter Q = ");
        int Q = sc.nextInt();

        int [] check = new int[Q];
        System.out.println("Enter the Elements of Q");
        for (int i = 0 ; i < check.length ; i++){
            check[i] = sc.nextInt();
        }

        elementcheck.check(arr , check);


    }
}
