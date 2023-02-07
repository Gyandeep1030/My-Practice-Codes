import java.util.Scanner;

public class substrat_evenAND_ADD_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        int store = 0;
        while (n>=s){
            if (s%2==0){
                store=store-s;
            }
            else{
                store=store+s;
            }
            s++;
        }
        System.out.println("Answer = "+store);
    }
}
