import java.util.Scanner;
class method1 {
    static boolean arr(int[] list){
        boolean check = true;
        for(int i = 1 ; i < list.length; i++){
            if (list[i]<list[i-1]){
                check = false;
                break;
            }
        }
        return check;

    }
}
public class check_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lenth of array");
        int n = sc.nextInt();
        int[] list = new int[n];
        System.out.println("enter your array of " + n + " elements ");
        for (int i = 0 ; i<list.length; i++){
            list[i]=sc.nextInt();
        }
//        method1 Check = new method1();
//        boolean ans = Check.arr(list);

        System.out.println(method1.arr(list));
    }
}
