import java.util.Arrays;

public class Array54_CheckSubArraySumZero {
    public static void checkSubArrSumZero(int [] arr){
        if (arr.length <= 1){
            System.out.println("Invalid array");
            return;
        }
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == 0){
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        System.out.println("Found : " + found);
    }

    public static void main(String[] args) {

        int [] arr = {1, 2, -2, 3, 4, 5, 6 };
        int [] arr2 = { 1, 2, 3, 4, 5, 6 };
        int [] arr3 = { 1, 52, -3, 74, -6, 6 };
        System.out.println(Arrays.toString(arr));
        checkSubArrSumZero(arr);
        System.out.println(Arrays.toString(arr2));
        checkSubArrSumZero(arr2);
        System.out.println(Arrays.toString(arr3));
        checkSubArrSumZero(arr3);

    }


}
