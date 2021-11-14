import java.util.Arrays;

public class Array28_DiffOfLargestSmallest {

    public static void diffOflarNSma(int [] a){
        if (a.length <= 0)
            return;
        Arrays.sort(a);
        int diff = a[a.length-1]-a[0];
        System.out.println("Diff of largest ele "+a[a.length-1]+" and smallest element "+a[0]+" is : "+diff);

    }

    public static void main(String[] args) {
        int [] integers = {5,2,9,1,20,10};
        System.out.println(Arrays.toString(integers));
        diffOflarNSma(integers);
    }
}
