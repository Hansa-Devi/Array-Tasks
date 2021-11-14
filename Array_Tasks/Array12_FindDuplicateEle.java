import java.util.Arrays;

public class Array12_FindDuplicateEle {

    public void duplicateEle(int[] arr) {
        if (arr.length <= 0){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]+" is duplicate at index: "+(j));
                    break;

                }
            }
        }
    }
    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int [] arr = {2,3,4,2,2,5,7,12,2};
        Array12_FindDuplicateEle obj = new Array12_FindDuplicateEle();
        obj.printArr(arr);
        obj.duplicateEle(arr);
    }


}
