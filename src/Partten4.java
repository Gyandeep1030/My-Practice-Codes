public class Partten4 {
    public static void main(String[] args) {
        int r = 4;
        int c = 1;
        for (int i = 1 ; i <= r ; i++){
            for (int j = 1 ; j <= r-i ; j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= c ; k++ ){
                System.out.print("*");

            }
            c+=2;
            System.out.println();
        }

    }
}
