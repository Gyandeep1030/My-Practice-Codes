import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<List<Integer>> generate(int r) {
        List<List<Integer>> list1 = new ArrayList<>();
        ArrayList<Integer> last = new ArrayList<>();
        for (int i = 0 ; i < r ; i++){
            ArrayList<Integer> inside = new ArrayList<>();
            for(int j = 0 ; j<=i ; j++){
                if(j==0 || j==i){
                    inside.add(j,1);
                }
                else{
                    inside.add(j,last.get(j) + last.get(j-1));
                }
            }
            last = inside;
            list1.add(i,inside);
        }
        return list1;
    }

}



public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(100);
        list.add(2);
        list.add(20);
        list.add(15);


        int s = 0;
        int j = list.size()-1;

        while(s<j){
            int temp = list.get(s);
            list.set(s , list.get(j));
            list.set(j , temp);
            s++;
            j--;

        }

        System.out.println(list);

//        list.add(1 , 2);
//        System.out.println(list.indexOf(15));
//        System.out.println(list.lastIndexOf(15));
//
//        System.out.println(list);


    }
}