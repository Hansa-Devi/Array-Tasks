import java.util.Arrays;

public class Array43SumOfFourElement {
    public static void sumOfFourEle(int [] arr , int sum){
        if (arr.length < 4){
            System.out.println("invalid Array");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length ; k++) {
                    for (int l = k+1; l < arr.length ; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == sum )
                        {
                            System.out.println("Group of four elements : "+arr[i] +" "+ arr[j] +" "+  arr[k] +" "+  arr[l]+" whose sum is: "+sum  );
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 1, 2};
        System.out.println(Arrays.toString(arr));
        sumOfFourEle(arr , 53);
    }
}
