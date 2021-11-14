import java.util.Arrays;
import java.util.Arrays.*;


public class Array8_CopyArray {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8};
        int [] copyArr = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            copyArr[i]=a[i];
        }
        for (int i = 0; i < copyArr.length ; i++) {
            System.out.print(copyArr[i]+" ");
        }

    }
}
