import java.util.Arrays;

public class Array50_SortMaxMinMaxMin {
    public static void sortMaxMin(int [] arr){
        int n  = arr.length;
        int [] newArr = new int[n];
        int small = 0;
        int large = n-1;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
         if (flag){
             newArr[i] = arr[large--];
         }
         else {
             newArr[i] = arr[small++];
         }
         flag = !flag;

        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(Arrays.toString(arr));
        sortMaxMin(arr);
    }
}
