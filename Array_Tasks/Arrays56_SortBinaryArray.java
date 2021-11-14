import java.util.Arrays;

public class Arrays56_SortBinaryArray {
    public static void sortBinaryArr(int [] arr){
        if (arr.length <= 0){
            return;
        }
        int len = arr.length-1;
        for (int i = 0; i < len ; i++) {
            if (arr[i] > 0){
                int temp = arr[i];
                arr[i] = arr[len];
                arr[len] = temp;
                i--;
                len--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        sortBinaryArr(arr);

    }
}
