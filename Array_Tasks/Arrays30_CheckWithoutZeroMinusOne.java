import java.util.Arrays;

public class Arrays30_CheckWithoutZeroMinusOne {
    public static void checkZeroMinusOne(int [] a){
        boolean free = true;
        if (a.length <= 0)
            return;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 || a[i] == -1){
                System.out.println("Array is not free of 0 or -1");
                free = false;
                break;
            }
        }
        if (free){
            System.out.println("Array is free of 0 & -1");
        }
    }

    public static void main(String[] args) {
        int [] arr = { 2 ,-1 ,3 , 0 , 1};
        System.out.println(Arrays.toString(arr));
        checkZeroMinusOne(arr);
        int [] arr1 ={2,4,6,8};
        System.out.println( Arrays.toString(arr1));
        checkZeroMinusOne(arr1);
    }
}
