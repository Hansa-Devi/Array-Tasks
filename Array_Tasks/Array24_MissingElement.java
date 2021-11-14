import java.util.Arrays;

public class Array24_MissingElement {
    public static  void findMissing(int [] a){
        int noOfEle = a.length+1;
        int exceptedSum = noOfEle * (noOfEle+1)/2;
        int sum =0;
        for (int ele:a) {
            sum += ele;
        }
        int missingEle = exceptedSum - sum;
        System.out.println("Missing element is :"+missingEle);
    }

    public static void main(String[] args) {
        int [] integers = {1,2,3,4,5,6,7,9};
        Arrays.toString(integers);
        findMissing(integers);

    }
}
