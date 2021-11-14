import java.util.Arrays;

public class Array18_SecondSmallestElement {
    public void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public void SecondSmallestE(int [] arr){
        if (arr.length <= 0)
            return;
        Arrays.sort(arr);
        System.out.printf("Second Smallest element :"+arr[1]);
    }

    public static void main(String[] args) {
        int [] arr ={2,6,10,1,5};
        Array18_SecondSmallestElement obj = new Array18_SecondSmallestElement();
        obj.printArr(arr);
        obj.SecondSmallestE(arr);
    }
}
