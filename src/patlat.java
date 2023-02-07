public class patlat {
    public static void main(String[] args) {


        int r = 4;
        for (int i = 1; i<=r ; i++){
            for (int j = 1; j<=r-i ; j++){
                System.out.print("*");
            }
            for (int l = 1 ; l<=i ; l++){
                if (l == 1 || i==r) {
                     System.out.print(i);
                }
                else {
                    System.out.print("*");
                }
            }
            for (int k = i-1 ; k>=1 ; k--){
                if (k==1 || i==r) {
                      System.out.print(i);
                }
                else {
                    System.out.print("*");
                }

            }

                System.out.println();
        }

    }
}
