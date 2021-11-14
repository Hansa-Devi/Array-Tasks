import java.util.Arrays;

public class Array55_PrintSubArrSumZero {
    public static void printSubArrSumZero(int [] arr){
        if (arr.length <1){
            System.out.println("Invalid Array");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = i; j < arr.length ; j++) {
                sum += arr[j];
                if (sum == 0){
                    for (int k = i; k <=j ; k++) {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };

        int [] arr2 = { 1, 2, -3, 4, 5, 6 };
        System.out.println();
        int [] arr3 = { 1, 2, -2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(arr));
        printSubArrSumZero(arr);
        System.out.println(Arrays.toString(arr2));
        printSubArrSumZero(arr2);
        System.out.println(Arrays.toString(arr3));
        printSubArrSumZero(arr3);
    }
}
