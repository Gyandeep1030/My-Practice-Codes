class rotate{
    static int[][] rotate90(int[][]arr){
        for (int i = 0 ; i< arr.length ; i++){
            for (int j = i ; j< arr.length ; j++ ){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
    static int[][] row(int[][]arr){
        for (int i = 0 ; i < arr.length; i++ ){
            rotate.rev(arr[i]);
        }
        return arr;
    }

    static void rev(int[]arr){
        int start = 0;
        int end = arr.length - 1;
        while (start<end){
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }

}


public class l90Rotatel {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate.rotate90(arr);
        rotate.row(arr);
        Callme.print2D(arr);

    }
}
