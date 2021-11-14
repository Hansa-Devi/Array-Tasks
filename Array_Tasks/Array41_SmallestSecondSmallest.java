import java.util.Arrays;

public class Array41_SmallestSecondSmallest {
    public static void smallestSecondSmallest(int [] a){
        if (a.length <2){
            return;
        }
        Arrays.sort(a);
        System.out.println("Smallest ele: "+a[0]);
        System.out.println("Second Smallest ele: "+a[1]);
    }

    public static void main(String[] args) {
        int [] arr = {3,6,8,9,10,2,-1};
        System.out.println(Arrays.toString(arr));
        smallestSecondSmallest(arr);
    }
}
