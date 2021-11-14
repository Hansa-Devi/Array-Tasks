import java.util.Arrays;

public class Array53_ReplaceWithNextGreater {
    public static void replaceWithSecLargest(int [] arr){
        if (arr.length <= 0){
            return;
        }

        int size = arr.length-1;
        int max_num = arr[size];
        arr[size] = -1;

        for (int i = size-1; i >= 0 ; i--) {
            int temp = arr[i];
            arr[i] = max_num;
            if (temp > max_num)
                max_num= temp;

        }


        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {45, 20, 100, 23, -5, 2, -6};
        System.out.println(Arrays.toString(arr));
        replaceWithSecLargest(arr);
    }
}
