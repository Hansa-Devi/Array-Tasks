import java.util.Arrays;

public class Array61_RearrangeArrEverSEcGreaterFromLeftRightEle {

    public static void rearrangeEverySecGreaterFromLeftRight(int [] arr){
        if (arr.length <1){
            System.out.println("Invalid Array");
            return;
        }
        for (int i = 1; i < arr.length ; i+= 2) {
            if (arr[i-1] > arr[i]){
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
            if (arr[i+1] > arr[i] && (i+1)< arr.length){
                int temp1 = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] ar = { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14};
        System.out.println(Arrays.toString(ar));
        rearrangeEverySecGreaterFromLeftRight(ar);
    }
}
