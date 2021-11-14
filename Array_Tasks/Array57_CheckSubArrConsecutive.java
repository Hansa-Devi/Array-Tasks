import java.util.Arrays;
import java.util.HashSet;

public class Array57_CheckSubArrConsecutive {
    public static void checkSubArrConsecutive(int [] arr){
        if (arr.length <1){
            System.out.println("Invalid Array");
            return;
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        int long_len = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i]-1)){
                int no = arr[i];
                while (hs.contains(no)){
                    no++;
                }
                if (long_len < (no - arr[i])){
                    long_len = no - arr[i];

                }
            }
        }
        System.out.println("True and it's length is : "+long_len);


    }
    public static void main(String[] args) {
        int [] arr = {2, 5, 0, 2, 1, 4, 3, 6, 1, 0 };
        System.out.println(Arrays.toString(arr));
        checkSubArrConsecutive(arr);
    }
}
