class array1{
    public void add(){
        int[] arr = {1,5,3};
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++ ){
            ans = ans + arr[i];
        }
        System.out.println(ans);
    }
}
public class sum_using_array {
    public static void main(String[] args) {
        array1 call = new array1();
        call.add();

    }
}
