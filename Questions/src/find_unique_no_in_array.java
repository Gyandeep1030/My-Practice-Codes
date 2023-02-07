class find{
    public static void unique(int[] arr){
        int count = 0;
        for (int i = 0 ; i<arr.length; i++){
            for (int j = i+1 ; j<arr.length; j++){
                if ( arr[i] == arr[j]){
                    arr[i]=arr[j]=-1;
                }
            }
        }
        for(int i = 0 ; i<arr.length ; i++){
            if (arr[i]!=-1){
                System.out.println(arr[i]);
            }
        }
//        return count;
    }
}


public class find_unique_no_in_array {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,3,2,1};
        find.unique(list);

    }
}
