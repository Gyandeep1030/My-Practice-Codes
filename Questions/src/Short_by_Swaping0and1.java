class helper{
    static int[] realswap(int[]arr ,int start , int end){

        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
        return arr;

    }

}

class changer{
    static int[] swap1(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if (arr[start] == 1 && arr[end]== 0){
                helper.realswap(arr , start , end);
            }
            if (arr[start] == 0){
                start++;
            }
            if (arr[end] == 1 ){
                end--;
            }
        }
        return arr;
    }

}

public class Short_by_Swaping0and1 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1};

        for(int i = 0 ; i<changer.swap1(arr).length ; i++){
            System.out.print(changer.swap1(arr)[i]+" ");
        }

    }


}
