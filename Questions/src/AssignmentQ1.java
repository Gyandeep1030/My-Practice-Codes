class Q1{
    public static String pair(int[] arr , int x){
        for (int i = 0 ; i<arr.length ; i++){
            for (int j = i+1; j< arr.length; j++){
                if(arr[j] - arr[i] == x){
                    return "Yes";

                }
            }
        }
        return "No";

    }
}
public class AssignmentQ1 {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7};
        int x = 0;
        System.out.println(Q1.pair(list ,x));
    }
}
