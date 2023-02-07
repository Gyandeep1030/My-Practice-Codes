class count{
    public static int[] list(int[]arr){
        int count = 0;
        for (int i = 0 ; i< arr.length ; i++){
            if (arr[i] == 0){
                count++;
            }
        }
        for (int i = 0 ; i< arr.length ; i++){
            if (i< count){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }

        }
        return arr;

    }
}


public class short_0s_and_1s {
    public static void main(String[] args) {
        int [] arr = {0,1,0,1,0,1};
//        int [] Temp = new int[arr.length];
//        int start = 0;
//        int end = Temp.length - 1;
//        for(int i = 0 ; i<arr.length ; i++){
//            if (arr[i] == 0){
//                Temp[start++] = arr[i];
//            }
//            if (arr[i] == 1){
//                Temp[end--] = arr[i];
//            }
//        }


        for(int i = 0 ; i<count.list(arr).length ; i++){
            System.out.println(count.list(arr)[i]);
        }
    }

}
