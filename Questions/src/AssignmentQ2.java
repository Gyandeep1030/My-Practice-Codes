public class AssignmentQ2 {
    public static void main(String[] args) {
        int[] list = {3,5,0,7,8,3,0};
        int x = 0;
        int count = 0;
        for (int i = 0 ; i < list.length ; i++){
                if(list[i] == x ){
                    count++;
                }
        }
        System.out.println(count);

    }
}
