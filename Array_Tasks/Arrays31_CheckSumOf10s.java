import java.util.Arrays;

public class Arrays31_CheckSumOf10s {
    public static void checkSumOf10s(int [] arr){
        int sum = 0 ;
        if (arr.length <= 0)
            return;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10){
                sum += arr[i];
            }
        }
        if (sum == 30){
            System.out.println("Sum of all 10s in array is 30");
        }
        else {
            System.out.println("Sum of all 10s in array is not 30");
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,5,10,15,10,10,2};
        System.out.println(Arrays.toString(arr));
        checkSumOf10s(arr);
        int [] arr1 = {2,50,15,10,10,2};
        System.out.println(Arrays.toString(arr1));
        checkSumOf10s(arr1);
    }
}
