
class rotate1{
    static int[] reverse(int[]arr , int i , int j){
//        int i = 0 ;
//        int j = arr.length-1;
        while (i<j){
//            swap(arr,i,j);
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];



            i++;
            j--;
        }
        return arr;

    }
}

public class reverse_using_swap {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
//        int[] reverse = rotate1.reverse(arr);
//        for (int i = 0 ; i<reverse.length; i++){
//            System.out.print(reverse[i]+" ");
//        }
//    }
}
