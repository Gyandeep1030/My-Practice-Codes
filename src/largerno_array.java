class Pro{
    void larger(){
        int[] list = {5,4,8,6};
        int store = 0;
        for (int i = 0 ; i < list.length; i ++){

            if (list[i] > store ){
                store = list[i];
            }
        }
        System.out.println(store);

    }
}
public class largerno_array {
    public static void main(String[] args) {
        Pro call = new Pro();
        call.larger();
    }
}
