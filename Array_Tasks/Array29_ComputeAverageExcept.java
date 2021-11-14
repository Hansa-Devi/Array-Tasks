import java.util.Arrays;

public class Array29_ComputeAverageExcept {
    public static void avgExceptLarNSma(int [] a){
        if (a.length <= 0)
            return;
        Arrays.sort(a);
        int noOfEle = a.length-2;
        int sum =0;
        float avg ;
        for (int i = 1; i < a.length-1 ; i++) {
            sum += a[i];
        }
        avg = sum/noOfEle;
        System.out.println(sum);
        System.out.println(noOfEle);
        System.out.println("Avg of Array Except Largest and Smallest ele is : "+avg);
    }

    public static void main(String[] args) {
        int [] interger = {2,8,9,10,4,6,11,1,20};
        System.out.println(Arrays.toString(interger));
        avgExceptLarNSma(interger);
    }
}
