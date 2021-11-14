import java.util.Arrays;

public class Array42SegregateZerosOnes {
    public static void segregateZeroOne(int [] arr){
        int length = arr.length;
        if (arr.length < 2){
            return;
        }
        for (int i = 0; i < length; i++) {
            if (arr[i] == 1){
                int temp = arr[length-1];
                arr[length-1]= arr[i];
                arr[i] = temp;
                length--;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {0,1,1,1,0,0,1,0,1,0,1,0};
        System.out.println(Arrays.toString(arr));
        segregateZeroOne(arr);
    }
}
