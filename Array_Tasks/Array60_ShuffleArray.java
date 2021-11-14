import java.util.Arrays;

public class Array60_ShuffleArray {
    public static void shuffleArr(int [] arr){
        if (arr.length <1){
            System.out.println("Invalid Array");
            return;
        }
        int noOfElements = arr.length;
        for (int i = 0; i < noOfElements ; i++) {
            int s = i +(int) (Math.random() * (noOfElements - i));

            int temp = arr[s];
            arr[s] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10,12,56};
        System.out.println(Arrays.toString(arr));
        shuffleArr(arr);

    }
}
