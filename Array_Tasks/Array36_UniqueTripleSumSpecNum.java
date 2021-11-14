import java.util.Arrays;

public class Array36_UniqueTripleSumSpecNum {
    public static void uniqueTriple(int[] arr , int sum){
        boolean s = false;
        if (arr.length<=0){
            return;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum ){
                        s = true;
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
        if (!s){
            System.out.println("No triple have sum: "+s);
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, -2, 0, 5, -1, -4};
        System.out.println(Arrays.toString(arr));
        uniqueTriple(arr , 2);
    }
}
