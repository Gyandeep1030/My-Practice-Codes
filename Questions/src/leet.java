import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        n = 0;

        for (int i = 0 ; i<nums1.length ; i++){

            nums1[m++] = nums2[n++];
        }
        Arrays.sort(nums1);

    }
}
public class leet {

    public static void main(String[] args) {
        int [] arr = {9};
        for (int i = 0 ; i < args.length -1 ; i++) {
            System.out.println(arr[i]);
        }

    }
}



