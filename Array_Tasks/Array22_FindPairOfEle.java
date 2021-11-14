import java.util.Arrays;

public class Array22_FindPairOfEle {
    public static void  findPairOfElement(int [] arr , int sum){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == sum){
                    System.out.println("sum of "+arr[i]+" & "+arr[j]+" is "+sum);
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] number = {3,4,1,5,0,2};
        System.out.println(Arrays.toString(number));
        findPairOfElement(number , 5);
    }
}

