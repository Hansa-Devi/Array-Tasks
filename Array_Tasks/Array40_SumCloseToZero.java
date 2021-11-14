import java.util.Arrays;

public class Array40_SumCloseToZero {
    public  static void sumCloseToZero(int [] arr){
        if (arr.length < 2){
            System.out.println("Invalid Array");
            return;
        }
        int sum;
        int min_num = 0;
        int max_num = 1;
        int sum_close_zero=arr[0] +arr[1];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(sum_close_zero)){
                    sum_close_zero = sum;
                    min_num = i;
                    max_num = j;
                }
            }
        }
        System.out.println("Two Numbers whose sum is cloe to zero are "+arr[max_num] +" & "+arr[min_num] + " sum is "+sum_close_zero);
    }

    public static void main(String[] args) {
        int [] arr = {1, 5, -4, 7, 8, -6};
        System.out.println(Arrays.toString(arr));
        sumCloseToZero(arr);
    }
}
