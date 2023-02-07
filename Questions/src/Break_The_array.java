class Q3sol {
    static int[] prefix(int[]arr){
        for (int i = 1 ; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    static int[] sufix(int[]arr){
        for (int i = arr.length -2 ; i>=0; i--){
            int j = i +1;
            arr[i] = arr[i] + arr[j];
        }
        return arr;

    }

    static boolean solution(int[]arr){

        int[] copy = arr.clone();
        int[] pre = Q3sol.prefix(arr);
        int[] suf = Q3sol.sufix(copy);
        for (int i = 0 ; i< pre.length -1 ; i++){
            for (int j = 1; j< suf.length ; j++){
                if (pre[i] == suf[j]){
                    return true;
                }
            }
        }
        return false;
    }

}


public class Break_The_array {
    public static void main(String[] args) {
        int[] arr = {15,5,6,4,8,2};
        System.out.println(Q3sol.solution(arr));


    }
}
