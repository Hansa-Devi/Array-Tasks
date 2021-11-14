import java.util.Arrays;

public class Array17_SecondLargestElement {
    public void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public void SecondLargestE(int [] arr){
        if (arr.length <= 0)
            return;
        Arrays.sort(arr);
        System.out.printf("Second Largest element :"+arr[arr.length-2]);
    }

    public static void main(String[] args) {
        int [] arr ={2,6,10,1,5};
        Array17_SecondLargestElement obj = new Array17_SecondLargestElement();
        obj.printArr(arr);
        obj.SecondLargestE(arr);
    }
}
