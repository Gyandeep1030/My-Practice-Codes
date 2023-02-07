import java.util.Scanner;

public class Sum_using_methods {
    Sum_using_methods(){
        System.out.println("Acha ji");
    }
        public int sum (int a ,int b){

            int c = a + b;
            return c;
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = a + b ;
//            System.out.println(c);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum_using_methods Add = new Sum_using_methods();
        int q = sc.nextInt();
        int p = sc.nextInt();
        int ans = Add.sum(q,p);

        System.out.println(ans);
    }
}

