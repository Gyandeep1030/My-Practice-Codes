import java.util.Scanner;

public class find_grater_no {
    public static void main(String[] args) {
        int[] list = {4,5,9,3,7,};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0; i<list.length; i++){
            if(x<list[i]){
                System.out.print(list[i]+" ");
            }
        }
    }
}
