class rotate{
    static int[] reverse(int[]arr){
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = (arr.length-1);  i>=0 ; i--){
            temp[j] = arr[i];
            j++;

        }
        return temp;
    }
}

public class reverse_the_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] reverse = rotate.reverse(arr);
        for (int i = 0 ; i<reverse.length; i++){
            System.out.print(reverse[i]+" ");
        }
    }
}
