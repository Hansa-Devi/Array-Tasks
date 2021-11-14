import java.util.Arrays;

public class Array46_PairInSortedRotated {
    public static void pairSumInRotateSorted(int [] arr , int sum){
        int len = arr.length;
        if (arr.length <= 0){
            System.out.println("Invalid Array");
            return;
        }
        int i;
        for (i = 0; i < len ; i++) {
            if (arr[i] > arr[i + 1])
                break;
        }

        int l = (i+1) % len;
        int r = i;
        while (l != r){

            if (arr[l] + arr[r] == sum ){
                System.out.println("True " + arr[l] +" , " +arr[r]);
            }
            if (arr[l] + arr[r] < sum ){
                l = (l+1) % len;
            }
            else {
                r = (len+r-1) & len;
            }
        }
        System.out.println("false");

    }
    public static void main(String[] args) {
        int [] arr  = {22, 25, 17, 18, 19, 20};
        int sum = 42;
        System.out.println(Arrays.toString(arr));
        pairSumInRotateSorted(arr , sum);

    }
}
