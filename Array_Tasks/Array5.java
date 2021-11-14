import sun.font.CreatedFontTracker;

//program to test if an array contains a specific value.
public class Array5 {
    public static boolean contains(int[] arr , int val){
        for (int ele:arr) {
            if (val == ele){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] a= {10,20,30,40,50};
        System.out.println(contains(a,20));
        System.out.println(contains(a,100));

    }
}
