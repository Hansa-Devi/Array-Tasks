import java.util.Arrays;

public class Array38MajorityElements {

    public static void majorityEle(int [] arr){
        int majority = arr.length/2;
        if (arr.length<=0){
           return;
        }
        for (int i = 0; i < (arr.length/2)+1; i++) {
            int count=0 ;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count >= majority){
                System.out.println("Majority element: "+arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int [] arr ={4,2,2,2,7,2,1,2,1,2,2,7,2,1,8,2,1,2,5,2};
        System.out.println(Arrays.toString(arr));
        majorityEle(arr);
    }
}
