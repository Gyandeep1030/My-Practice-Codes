class methodmax{
    public static int max(int[]arr){
        int maxstart = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > maxstart)
                maxstart = arr[i];
        }
        return maxstart;


    }
    public static int[] change(int[]arr){
        for (int i = 0 ; i < arr.length; i++){
            if(arr[i] == max(arr)){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return arr;
    }
}
public class find_the_second_larger_no {
    public static void main(String[] args) {
        int[] list = {9,8,9,6,9,5,8};
        System.out.println("max - "+methodmax.max(list));
        //second max

        System.out.println("2nd max - "+methodmax.max(methodmax.change(list)));

    }
}
