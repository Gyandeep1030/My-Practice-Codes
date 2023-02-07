import java.util.Arrays;

class solvertest{
    public void sortColors(int[] nums) {
        int redSt=0, y=nums.length-1;
        int i=0;
        while(i<y+1){
            if(nums[i]==0){
                int tmp = nums[i];
                nums[i] = nums[redSt];
                nums[redSt] = tmp;
                redSt++;
                i++;
                continue;
            }
            if(nums[i] ==2){
                int tmp = nums[i];
                nums[i] = nums[y];
                nums[y] = tmp;
                y--;
                continue;
            }
            i++;
        }
    }








    }



public class runer {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        int k = 3;



        for (int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]);
        }



    }
}
