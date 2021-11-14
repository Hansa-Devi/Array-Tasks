import java.util.Arrays;

public class Array47_CountRotation {
    public static void rotateCount(int [] a){
        int lo = 0;
        int hi= a.length-1;


        if (a.length <=1 || a[lo] <= a[hi]){
            System.out.println("Invalid Array");
            return;
        }

        while (lo <= hi){
            int mid = (lo+hi)/2;

            if (a[mid] > a[mid+1] ){
                //mid is last element of part 1
                System.out.println(mid+1);
                break;
            }
            else if (a[mid] < a[mid-1]){
                // mid is first element of part 2
                System.out.println(mid);
                break;
            }
            else if (a[lo] <= a[mid]){
                lo = mid+1;
            }
            else if (a[mid] <= a[hi]){
                hi = mid-1;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr ={35, 32, 30, 14, 18, 21, 27};
        System.out.println(Arrays.toString(arr));
        rotateCount(arr);
    }
}
