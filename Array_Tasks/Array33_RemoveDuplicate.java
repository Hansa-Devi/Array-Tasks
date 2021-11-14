import java.util.Arrays;

public class Array33_RemoveDuplicate {
    public static void removeDuplicate(int [] a){
        int len = a.length;
        if (a.length <= 0)
            return ;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <len; j++) {
                if (a[i] == a[j]){
                    a[j] = a[len-1];
                    len--;
                    j--;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nlength of new array is : "+len);
    }

    public static void main(String[] args) {
        int [] arr = {20, 20, 30, 40, 50, 50, 50};
        System.out.println(Arrays.toString(arr));
        removeDuplicate(arr);
    }
}
