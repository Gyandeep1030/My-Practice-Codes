public class find_the_pair {
    public static void main(String[] args) {
        int [] arr = {4,6,3,5,8,2};
        int x = 7;
        int count = 0;
        for(int i = 0 ; i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == x ) {
                    count++;

                }
            }
        }
        count = count/2;
        System.out.println(count);
    }
}
