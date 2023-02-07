class Recursion{
    public static void callme(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        Recursion.callme(--n);
    }
}


public class firstQ1 {
    public static void main(String[] args) {
        int n = 10;
        Recursion.callme(n);

    }
}
