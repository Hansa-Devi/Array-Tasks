//program to calculate the average value of array elements
public class Array4 {
    public static void main(String[] args) {
        int sum = 0;
        int avg = 0;
        int [] a = {10,20,30,40,50};
        for (int i = 0; i <a.length ; i++) {
            sum += a[i];
        }
        avg = sum/a.length;
        System.out.println("Avg of Array is "+avg);
    }

}
