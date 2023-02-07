public class prefix_sum_Q1 {
    public static void main(String[] args) {
        int [] a = {2,1,3,4,5};
        int [] temp = new int[a.length];
        for (int i = 1 ; i<a.length; i++){
            int j = i -1;
            a[i] = a[i] + a[j];
            }
        for (int i = 0 ; i<a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }


}
