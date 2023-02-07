class helperodd{
    static int[] realswap(int[]arr ,int start , int end){

        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
        return arr;

    }

}

class changerodd{
    static int[] swap1(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if (arr[start] % 2 != 0 && arr[end] % 2 == 0){
                helperodd.realswap(arr , start , end);
            }
            if (arr[start] % 2 == 0){
                start++;
            }
            if (arr[end] % 2 != 0){
                end--;
            }
        }
        return arr;
    }

}

public class Even_Then_Odd {
    public static void main(String[] args) {
        int[] arr = {3,5,7,2,4,6,8};

        int[] ans = changerodd.swap1(arr);


        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i]+" ");
        }

    }


}
