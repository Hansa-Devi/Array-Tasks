import java.util.Arrays;

public class Array27_EvenOdd{
    public static void evenNodd(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                System.out.println(arr[i]+" Even Number");
            }
            else {
                System.out.println(arr[i]+" Odd Number");
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8};
        Arrays.toString(array);
        evenNodd(array);
    }
}
