import java.util.Arrays;

public class Array49_ArrangePosNeg {
    public static void arrangePosNeg(int [] arr){
        if (arr.length <=1){
            System.out.println("Invalid Array");
            return;
        }
        while (true) {
            int i = 0;
            int j = arr.length - 1;
            while (arr[i] > 0 && i < j) {
                i++;
            }
            while (arr[j] < 0 && i < j) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else
                break;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        System.out.println(Arrays.toString(arr));
        arrangePosNeg(arr);
    }
}
