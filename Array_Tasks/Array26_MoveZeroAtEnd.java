import java.util.Arrays;

public class Array26_MoveZeroAtEnd {
    public static void moveZeroAtEnd(int [] a){
        int count = 0;
        if (a.length <= 0)
            return;
        for (int i = 0; i < a.length ; i++) {
            if (a[i] != 0) {
                a[count++] = a[i];
            }
        }
        while (count < a.length){
            a[count++] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int [] array = {1,0,4,0,2,0,0,6,0,8,9};
        System.out.println(Arrays.toString(array));
        moveZeroAtEnd(array);
    }
}
