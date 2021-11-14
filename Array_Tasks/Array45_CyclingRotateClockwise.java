import java.util.Arrays;

public class Array45_CyclingRotateClockwise {
    public static void rotateClockwise(int[] arr){
        if (arr.length < 1){
            System.out.println("Invalid Array");
            return;
        }
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]= temp;
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int [] arr ={10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(arr));
        rotateClockwise(arr);
    }
}
