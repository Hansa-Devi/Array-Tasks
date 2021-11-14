
import java.util.Arrays;

public class Array52_SeparateEvenOdd {
    public static void separateEvenOdd(int [] arr){
        if (arr.length <= 1){
            System.out.println("Invalid Array");
            return;
        }
        int len =arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i]%2 != 0){
                int temp = arr[len-1];
                arr[len-1] = arr[i];
                arr[i] = temp;
                i--;
                len--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        System.out.println(Arrays.toString(arr));
        separateEvenOdd(arr);
    }
}
