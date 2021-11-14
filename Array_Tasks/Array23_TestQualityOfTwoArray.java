import java.util.Arrays;

public class Array23_TestQualityOfTwoArray {

    public static void testArraysQuality(int [] a1 , int [] a2){
        if (a1.length <= 0 || a1.length != a2.length)
            return;
        for (int i = 0; i < a1.length ; i++) {
            if (a1[i] != a2[i]){
                System.out.println("Arrays are not equal");
                break;
            }
        }
        System.out.println("Arrays are equal");
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};
        System.out.println("Arrays1: "+Arrays.toString(arr1));
        System.out.println("Arrays2: "+Arrays.toString(arr2));
        testArraysQuality(arr1,arr2);
    }
}

