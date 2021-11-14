import java.util.Arrays;

public class Array11_ReverseArray {
    public static void main(String[] args) {
        int [] arr = {2,5,6,8,10};
        Array11_ReverseArray obj = new Array11_ReverseArray();
        obj.printArr(arr);
        System.out.println(" ");
        obj.reserveArray(arr);
        obj.printArr(arr);
    }

    public void reserveArray(int[] arr) {
        int temp;
        if (arr.length <= 0){
            return;
        }
        for (int i = 0; i < (arr.length)/2 ; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;

        }
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
//public static void reverse(int[] array){
//    int start = 0;
//    int end = array.length-1;
//    int temp;
//    while (start < end){
//        temp = array[start];
//        array[start] = array[end];
//        array[end] = temp;
//        start++;
//        end--;
//
//    }
//    System.out.println(Arrays.toString(array));
//}
//
//
//
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6};
//        reverse(array);
//
//    }
}
