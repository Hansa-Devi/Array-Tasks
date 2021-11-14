import java.util.Arrays;

public class Array32_CheckSpecEle {
    public static void checkSpecEle(int [] arr){
        boolean contain65 = false;
        boolean contain77 = false;
        if (arr.length <= 0)
            return;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 65 ){
                contain65 = true;
            }
            else if (arr[i] == 77){
                contain77 = true;
            }
        }
        if (contain65 && contain77){
            System.out.println("Arrays contain 65 and 77");
        }
        else {
            System.out.println("Arrays doesn't contain 65 or 77");
        }
    }

    public static void main(String[] args) {
        int [] arr1 = {65,20,80,75,77};
        System.out.println(Arrays.toString(arr1));
        checkSpecEle(arr1);
        int [] arr2 = {65,20,80,75};
        System.out.println(Arrays.toString(arr2));
        checkSpecEle(arr2);
    }
}
