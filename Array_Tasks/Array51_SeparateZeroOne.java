import java.util.Arrays;

public class Array51_SeparateZeroOne {
    public static void separateZeroOne(int [] arr){
        if (arr.length <= 1){
            System.out.println("Invalid Array");
            return;
        }
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 1){
                int temp = arr[len-1];
                arr[len-1] = arr[i];
                arr[i]=temp;
                len--;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {0, 0, 1, 1, 0, 1, 1, 1,0};
        System.out.println(Arrays.toString(arr));
       separateZeroOne(arr);
    }
}
