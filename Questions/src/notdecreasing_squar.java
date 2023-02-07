import java.util.Arrays;

public class notdecreasing_squar {
    public static void main(String[] args) {
        int[] arr = {-2,-1,2,3,4};
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }


    }

}
