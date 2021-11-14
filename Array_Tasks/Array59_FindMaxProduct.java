import java.util.Arrays;

public class Array59_FindMaxProduct {
    public static void maxProduct(int [] arr){
        if (arr.length <=0){
            return;
        }
        int max_product = 0;
        int num1=0;
        int num2 = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] * arr[j] > max_product){
                    max_product = arr[i] * arr[j];
                    num1 =arr[i];
                    num2 =arr[j];
                }
            }
        }
        System.out.println("Max Product is : "+max_product+ " of number "+num1+" & "+num2);
    }
    public static void main(String[] args) {
        int [] num = {2, 3, 5, 7, -7, 5, 8, -5};
        System.out.println(Arrays.toString(num));
        maxProduct(num);
    }
}
