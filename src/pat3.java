public class pat3 {
    public static void main(String[] args) {
        int r = 5;
        int x = 5;
        for (int i =1  ; i <= r ; i++,x--){
            for (int j = x ; j >=1 ; j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
