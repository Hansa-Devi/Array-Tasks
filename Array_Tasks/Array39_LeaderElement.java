import java.util.Arrays;

public class Array39_LeaderElement {
    public static void leaderEle(int [] a){
        if (a.length <= 0){
            return;
        }
        for (int i = 0; i < a.length; i++) {
            boolean leader = true;
            for (int j = i+1; j < a.length ; j++) {
                if (a[i] < a[j]){
                    leader =false;
                    break;
                }
            }
            if (leader){
                System.out.println("Element "+a[i]+" is leader element.");
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {8,2,7,1,3,2,1};
        System.out.println(Arrays.toString(arr));
        leaderEle(arr);
    }
}
