import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int [] list = new int[n];
        System.out.println("Enter your Array values");
        for(int i = 0 ; i < list.length ; i++){
            list[i]=sc.nextInt();
        }
        for (int i = 0 ; i < n; i++){
            System.out.print(list[i] + " ");
        }

    }
}
