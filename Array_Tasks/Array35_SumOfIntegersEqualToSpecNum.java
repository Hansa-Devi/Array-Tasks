import java.util.Arrays;

public class Array35_SumOfIntegersEqualToSpecNum {
     static boolean sum= false;
    public static void sumOfNum(int [] arr ,int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    sum = true;
                    System.out.println("Sum of two number : " + arr[i] + " && " + arr[j] + " is " + num);
                }
            }
        }
        if (!sum) {
            System.out.println("No two numbers with sum : "+num);
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9};
        System.out.println(Arrays.toString(arr));
        sumOfNum(arr , 6);

    }
}
